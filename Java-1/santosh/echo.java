package santosh;

import java.util.Scanner;

public class echo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter String");
	String b=scan.nextLine();
	System.out.println(b);
	for(int i=0; i<args.length; i++)
		System.out.println(args[i]);
	
	
}
}
