package santosh;

import java.util.Scanner;

public class Property {
 public static void main(String[] args) {
 /*	System.out.println(System.getProperty("java.version"));
	System.out.println(System.getProperty("java.runtime.version"));
	System.out.println(System.getProperty("java.home"));
	System.out.println(System.getProperty("java.vendore"));
	System.out.println(System.getProperty("java.vendore.url"));
	System.out.println(System.getProperty("java.class.path"));*/

	 Scanner obj = new Scanner(System.in);
	int a = obj.nextInt(); 
	System.out.println("First input integer:"+a);
	int b = obj.nextInt(); 
	System.out.println("Second input Integer:" +b);
	
	if ( a != b )           
        System.out.println(a!= b );  

	 
	 
}
}
