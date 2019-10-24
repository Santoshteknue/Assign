#!/bin/bash

if [[ $# -lt 1 ]]
then 
     echo "error : enter the name of the test program";
     exit 1
fi 
   


read -p "enter the first cpu affinity mask:" mask1
read -p "enter the second cpu affinity mask:" mask2
read -p "enter the third cpu affinity mask:" mask3
read -p "enter the fourth cpu affinity mask:" mask4


taskset ${mask1} ./$1& 
taskset ${mask2} ./$1& 
taskset ${mask3} ./$1& 
taskset ${mask4} ./$1& 
