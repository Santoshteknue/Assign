package logical;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter Integer Number");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		
			System.out.println("Odd Number");

	}

}
