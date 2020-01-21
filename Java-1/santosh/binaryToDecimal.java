package santosh;
import java.util.*;
public class binaryToDecimal {
 public static void main(String[] args) {
	long bin;
	long dec = 0;
	int j = 1;
	long rem;
	System.out.println("Enter binary Number");
	Scanner scan=new Scanner(System.in);
	bin=scan.nextLong();
	while(bin!=0)
	{
		rem=bin%8;
		dec=dec+rem*j;
		j=j*2;
		bin=bin/8;
		
		
	}
	System.out.println("Decimal Number="+ dec);
	
}
}
