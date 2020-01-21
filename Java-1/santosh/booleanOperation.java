package santosh;

import java.util.Scanner;
import java.io.*;

public class booleanOperation {
 //public static void main(String[] args) {
	 /*Scanner obj = new Scanner(System.in);
	 System.out.println("Enter the First num=");
		int a = obj.nextInt(); */
	 
	 static int getSum(int n) 
	    {     
	        int sum = 0; 
	          
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        } 
	      
	    return sum; 
	    } 
	  
	    // Driver program 
	    public static void main(String[] args) 
	    { 
	        int n = 687; 
	  
	        System.out.println(getSum(n)); 
	    } 
	
}
