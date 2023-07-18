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
cd spark
./bin/docker-image-tool.sh -r $REGISTRY -t latest -p ./Dockerfile build
./bin/docker-image-tool.sh -r $REGISTRY -t latest push