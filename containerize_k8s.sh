#!/bin/bash
VALID_ARGS=$(getopt -o r: --long registry: -- "$@")
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
    --) shift; 
        break 
        ;;
  esac
done

sudo service docker start
rm -rf ./spark/app/*
cp __init__.py \
    blob_storage.py \
    helpers.py ./spark/app/
cp requirements_wo_pyspark.txt ./spark/app/requirements.txt
cd spark
./bin/docker-image-tool.sh -r $REGISTRY -t latest -p ./Dockerfile build
./bin/docker-image-tool.sh -r $REGISTRY -t latest push