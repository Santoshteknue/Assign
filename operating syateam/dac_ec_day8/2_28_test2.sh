#!/bin/bash

#taskset 0x00000001 ./w11 
#taskset 0x00000001 ./w11& 
#taskset 0x00000001 ./w11& 
#taskset 0x00000001 ./w11& 
##in this context, we are using a program file/
###object file from a mounted file system on 
###mnt1 -->this filesystem contains additional 
####workspace, for our system - this is not 
####same, as rootfs --->this is very much 
#### a common mechanism, in the Unix/Linux 
#### systems 
##### if we need to activate additional file systems
#### and access directories /files, in the additional 
#### file systems,we need to first mount the additional 
#### file system, using mount command(supervisor command), 
##### which uses mounting mechanism of core of the OS    


/mnt1/root/os_linux_feb_2019/examples_samples/w1& 
/mnt1/root/os_linux_feb_2019/examples_samples/w1& 
/mnt1/root/os_linux_feb_2019/examples_samples/w1& 
/mnt1/root/os_linux_feb_2019/examples_samples/w1 

exit 0







