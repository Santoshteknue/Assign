package santosh;

import java.util.Scanner;

//import java.util.*;
public class DecimalToOctal {
 public static void main(String[] args) {
	
	 int dec,quot,i =1,j;
	
	 int oct[]=new int[100];
	Scanner obj=new Scanner(System.in);
	 System.out.println("Enter the Decimal Number");
	 dec=obj.nextInt();
	 quot=dec;
	 while(quot!=0) {
		 oct[i++]=quot%8;
		 quot=quot/8;
		 
	 }
	System.out.println("Octal Number is=");
	for(j=i-1; j>0;j--)
	{
		System.out.println(oct[j]);
	}
	//System.out.println("");
}
}