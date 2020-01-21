package logical;
import java.util.Scanner;
public class fabinoccis {
	
public static void main(String[] args) {
		
	System.out.println("Enter THe Number upto fabonices series to print");
	int Number= new Scanner(System.in).nextInt();
	System.out.println("Faboniccis series Upto "+Number+ "Numbers");
	for (int i = 1; i <=Number; i++) {

		System.out.println(faboniccis(i) + "");
	}
}

private static int faboniccis(int i) {
	if(i==1 || i==2)
	{
		return 1;
	}
	return faboniccis(i-1)+ faboniccis(i-2);
	
}
}
