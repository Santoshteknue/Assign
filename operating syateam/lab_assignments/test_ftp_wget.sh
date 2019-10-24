#!/bin/bash
###this is just a basic sample
###you can improvise, as per your requirements 
LOCAL_DIR=$1

REMOTE_DIR=$2

REMOTE_IP_ADDR=$3

cd LOCAL_DIR

wget -r -nH  ftp://${REMOTE_IP_ADDR}/${REMOTE_DIR}




