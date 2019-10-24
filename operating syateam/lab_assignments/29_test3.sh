#!/bin/bash

#if [ -e $1 ]
#then echo "file exists"  
#else
#   echo " file does not exist"
#   exit 1
#fi


taskset 0x00000001  $1& 
taskset 0x00000001  $2& 
taskset 0x00000001  $3

exit $?



