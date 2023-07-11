#!/bin/bash

# Run this script once for each AKS cluster
VALID_ARGS=$(getopt -o r:a:s:g:z:c:e:p:q: --long registry:,app_id:,secret:,resource_group:,subscription_id:,cluster:,app_secret:,pool:,node_size: -- "$@")
if [[ $? -ne 0 ]]; then
    exit 1;
fi

eval set -- "$VALID_ARGS"
while [ : ]; do
  case "$1" in
    -r | --registry)
        REGISTRY=$2
        shift 2
        ;;
    -a | --app_id)
        APP_ID=$2
        shift 2
        ;;
    -s | --secret)
        AKS_SECRET=$2
        shift 2
        ;;
    -g | --resource_group)
        RG=$2
        shift 2
        ;;
    -z | --subscription_id)
        SUB_ID=$2
        shift 2
        ;;
    -c | --cluster)
        CLUSTER=$2
        shift 2
        ;;
    -e | --app_secret)
        APP_SECRET=$2
        shift 2
        ;;
    -p | --pool)
        NODE_POOL=$2
        shift 2
        ;;
    -q | --node_size)
        NODE_SIZE=$2
        shift 2
        ;;
    --) shift; 
        break 
        ;;
  esac
done

az login

sudo apt-get update

cd ${HOME}

# -----------This is for installing spark from source----------
# # set JAVA_HOME path
# echo -e "export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64" >> ~/.bashrc
# source ~/.bashrc

# # Build spark with kubernetes support from source
# git clone https://github.com/apache/spark
# sudo apt install maven
# ./build/mvn -Pkubernetes -DskipTests clean package

# # Remove cached packages and pull packages from maven central only
# rm -rf ~/.m2 ~/.ivy2
# -----------------------Do not run the above lines--------------

# Install kubectl
# echo "Installing kubectl..."
# curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
# sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl

# Create new AKS cluster
# Generate SSH key before running the below command
echo "Creating cluster..."
az aks create \
  --resource-group $RG \
  --name $CLUSTER \
  --node-count 3 \
  --location eastus \
  --enable-aad \
  --enable-azure-rbac \
  --enable-cluster-autoscaler \
  --min-count 1 \
  --max-count 10 \
  --max-pods 100 \
  --node-vm-size $NODE_SIZE \
  --ssh-key-value ${HOME}/.ssh/id_rsa.pub

# Example usage
# az aks create \
#   --resource-group msecon-user-amondal \
#   --name spotpricingaksnew \
#   --node-count 3 \
#   --location eastus \
#   --enable-aad \
#   --enable-azure-rbac \
#   --enable-cluster-autoscaler \
#   --min-count 0 \
#   --max-count 10 \
#   --max-pods 100 \
#   --node-vm-size "Standard_D4s_v3" \
#   --ssh-key-value /home/amondal/.ssh/id_rsa.pub

# Enable RBAC on Kubernetes cluster
echo "Enabling RBAC..."
az aks update -g $RG -n $CLUSTER --enable-azure-rbac

# Get AKS cluster credentials
echo "Getting credentials..."
rm -rf ${HOME}/.kube/config
az aks get-credentials --resource-group $RG --name $CLUSTER \
  --subscription $SUB_ID --admin --file "${HOME}/.kube/config" 

chmod 600 "${HOME}/.kube/config" 

# Example usage
# az aks get-credentials \
#   --resource-group msecon-user-amondal \
#   --name spotpricingaks \
#   --subscription 8b8bb587-f3be-48c9-abef-e0c0087213b2

# Use this command in WSL because credentials are stored on 
# Windows folder C:\Users\<user>\.kube\config

# az aks get-credentials --resource-group "$1" --name "$2" \
#   --subscription "$3" --file "~/.kube/config"

# Authenticate device
kubelogin convert-kubeconfig -l azurecli

# Run kubectl proxy in background
# Do not run this if already running
echo "Running kubectl proxy in background..."
nohup kubectl proxy >kproxy.txt 2>&1 &

# Create AKS docker registry, to pull images from ACR using AAD 
# authentication
echo "Creating kubernetes docker registry..."
kubectl create secret docker-registry $AKS_SECRET \
    --docker-server=$REGISTRY \
    --docker-username=$APP_ID \
    --docker-password=$APP_SECRET

# Create new service account
echo "Creating service account..."
kubectl create serviceaccount spark

# Assign role to service account
kubectl create clusterrolebinding spark-role \
    --clusterrole=edit \
    --serviceaccount=default:spark \
    --namespace=default

# Create new node pool for application
echo "Creating nodepool..."
az aks nodepool add \
    --resource-group $RG \
    --cluster-name $CLUSTER \
    --name $NODE_POOL \
    --node-vm-size $NODE_SIZE \
    --node-osdisk-size 128 \
    --os-sku "Ubuntu" \
    --enable-cluster-autoscaler \
    --max-count 20 \
    --max-pods 100 \
    --min-count 0 \
    --mode "User" \
    --node-count 1

# Example for node pool creation
# az aks nodepool add \
#     --resource-group "msecon-user-amondal" \
#     --cluster-name "spotpricingaksnew" \
#     --name "pysparkpool" \
#     --node-vm-size "Standard_D4s_v3" \
#     --node-osdisk-size 128 \
#     --os-sku "Ubuntu" \
#     --enable-cluster-autoscaler \
#     --max-count 20 \
#     --max-pods 100 \
#     --min-count 1 \
#     --mode "User" \
#     --node-count 1

# Install Helm for Kubernetes
# wget https://get.helm.sh/helm-v3.12.1-linux-amd64.tar.gz
# tar xvf helm-v3.12.1-linux-amd64.tar.gz
# sudo mv linux-amd64/helm /usr/local/bin

# Add spark-operator
helm repo add spark-operator https://googlecloudplatform.github.io/spark-on-k8s-operator
# If already present do uninstall
helm uninstall my-release
# Run spark-operator in default namespace
helm install my-release spark-operator/spark-operator --set sparkJobNamespace=default