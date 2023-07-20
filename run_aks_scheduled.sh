#!/bin/bash
# Do not commit this file or add in container

# Set runtime environment variables including secrets and passwords
source set_runtime_env.sh

# Build the base spark-py image
./containerize_k8s.sh --registry $ACR_URL

# Build and push the scheduler docker image
docker build --build-arg "base_img=$PYSPARK_IMAGE" -t $AKS_SCHEDULER_IMAGE .
docker tag $AKS_SCHEDULER_IMAGE $ACR_URL/$AKS_SCHEDULER_IMAGE
docker push $ACR_URL/$AKS_SCHEDULER_IMAGE

# Kubernetes secrets for deployment
kubectl create secret generic app \
    --from-literal="app_id=$APP_ID" \
    --from-literal="tenant_id=$TENANT_ID" \
    --from-literal="app_secret=$APP_SECRET" \
    --from-literal="blob_storage_url=$BLOB_STORAGE_URL" \
    --from-literal="blob_storage_inp=$BLOB_STORAGE_INP_CONTAINER" \
    --from-literal="blob_storage_out=$BLOB_STORAGE_OUT_CONTAINER"

# Deploy volcano scheduler
kubectl apply -f https://raw.githubusercontent.com/volcano-sh/volcano/master/installer/volcano-development.yaml

# Deploy the cron scheduler
kubectl apply -f aks-manifest.yml

# Delete the deployment usingthe below command
# kubectl delete -f aks-manifest.yml