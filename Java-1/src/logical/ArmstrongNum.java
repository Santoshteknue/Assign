package logical;

import java.util.Scanner;

public class ArmstrongNum {
public static void main(String[] args) {
	 int num = 370, number, temp, total = 0;
	System.out.println("Enter 3 Digit Number");
	Scanner Scan= new Scanner(System.in);
	num=Scan.nextInt();
	 

      number = num;
      while (number != 0)
      {
          temp = number % 10;
          total = total + temp*temp*temp;
          number /= 10;
      }

      if(total == num)
          System.out.println(num + " is an Armstrong number");
      else
          System.out.println(num + " is not an Armstrong number");
  }
}
