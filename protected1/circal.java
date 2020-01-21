package protected1;

import java.util.Scanner;

public class circal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int Radius1;
       int Radius2;
       double pi=3.14 ,Area;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter Radius1 of Circal : ");
       Radius1=scan.nextInt();
       Area=pi*Radius1*Radius1;
       System.out.println("Area of Circal : " + Area + "\n");
       
       System.out.println("Enter Radius2 of Circal : ");
       Radius2=scan.nextInt();
       Area=pi*Radius2*Radius2;
       
       System.out.println("Area of Circal : " + Area);
       
	}

}
