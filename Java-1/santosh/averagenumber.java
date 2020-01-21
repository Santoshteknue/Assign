package santosh;
import java.util.*;
public class averagenumber {
  public static void main(String[] args) {
	  System.out.println("enter the first no");
		Scanner num1=new Scanner(System.in);
		int first=num1.nextInt();
		//System.out.println(first);
		System.out.println("enter the second no");
		int second=num1.nextInt();

		System.out.println("enter the third no");
		int third=num1.nextInt();
		
		System.out.println("enter the fourth no");
		int fourth=num1.nextInt();
		
		int result=(first+second+third+fourth)/4;
		System.out.println("Average of number is=" +result);
		
}
}
