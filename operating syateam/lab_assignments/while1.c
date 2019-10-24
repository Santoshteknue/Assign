#include <stdio.h>
#include <stdlib.h>
#include <sched.h>

//const int glob1 = 0x33;
int glob1 = 0x33;
int glob2 = 0x55; 


int main()
{
 //
 //pointers, in a programming language is nothing but 
 //virtual / logical addresses, in the OS/kernel context 
 //so, if we use virtual /logical addresses, they will 
 //be stored/assigned to pointer variables and dereferenced ??
 //
 //
 char *ptr = (char *)0x00000000;  //illegal virtual address
                                  //ununsed /invalid
//char *ptr = (char *)0x0000000a;  //illegal/ununsed /invalid
//  char *ptr = (char *)0x08048000;  //illegal
// char *ptr = (char *)0xc0000000;  //illegal/ununsed /invalid
//   char *ptr = 0x08048000; //code /text segment/illegal for 
                           //write access 
//     char *ptr = 0x08049000; //ready only data segment 
//   char *ptr = 0x0804a000;   //read and write data segment 
 //  char *ptr = 0xc0000000;   //valid kernel space segment,
                            //invalid access privileges 

  //  *ptr = 0xaa;
  // printf("ptr value is %c\n", (*ptr)); 

   int local1 = 0x55;

   glob1++;
   glob2++;


  // printf(" glob1 is %x\n", glob1); 
  // printf("address glob2 is %x\n", glob2); 
   printf("address glob1 is %lx\n", (unsigned long)&glob1); 

   printf("address glob2 is %lx\n", &glob2); 
   
   printf("address local1 is %lx\n", &local1); 
  

    printf("address main is %lx\n", &main); 
//    printf("address is %lx\n", &sched_yield); 
   

//   alarm(180); //this is a system call API, 
                 //which tells the system 
               //to generate a SIGALRM signal 
               //after 120seconds !!!
               //SIGALRM signal leads to 
               //termination of the process
               //abnormally !!!
   //sleep(1);
 //  while(1);  //a simple job, in an application/active application
  // while(1) sched_yield();
  //  alarm(20); //this is wrong ???

   while(1) {

              //we will add a job 
//     sched_yield();
//          printf("this is a bad diagnostics\n"); 
  }
   //while(1) sleep(1);
   //this is not a good approach to deal with scheduler 


  //if this code/program/application reaches here, 
  //it will complete 
 
  //exit() will be executed - what happens, if exit() 
  //will be executed ??

  //exit() will normally terminate the process and the 
  //process will enter terminated state/zombie state - 
  //since exit() is explicitly invoked by the application/
  //code/program,we say that the process is normally 
  //terminated - this is a normal termination of 
  //a process  
  

   exit(0); 

} 
