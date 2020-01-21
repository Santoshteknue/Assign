package santosh;

import java.util.Scanner;

public class areaHexagon {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input the length of a side of the hexagon:");
		double s=scan.nextDouble();
		System.out.print("The area of the hexagon is: " + hexagon(s)+"\n");
		  
	}
	public static double hexagon(double s) {
		
		return (6 * (s*s))/(4*Math.tan(Math.PI/6));
		
	}

}
