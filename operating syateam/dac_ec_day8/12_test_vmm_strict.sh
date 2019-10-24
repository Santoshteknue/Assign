#!/bin/bash

#sudo echo 1  > /proc/sys/vm/overcommit_memory
#sudo echo 70 > /proc/sys/vm/overcommit_ratio
sudo -i

./ex2 $1
./ex2 $2
./ex2 $3

while true
do 
:
done

##we can add more code/commands below, 
###after the above settings  
