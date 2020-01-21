package santosh;
import java.util.*;
public class BinaryToOctal {
 public static void main(String[] args) {
	int bin,bin1,quot,dec=0,rem,i=1,j;
	int oct[]=new int[100];
	Scanner scan=new Scanner(System.in);
	System.out.println("Emter The Binar Number");
	bin=scan.nextInt();
	bin1=bin;
	while(bin>0)
	{
		rem=bin%10;
		dec = dec+rem*i;
		i=i*2;
		bin=bin/10;
	}
	i=1;
	quot=dec;
	while(quot>0)
	{
		oct[i++]=quot%8;
		quot=quot/8;
		
	}
	System.out.println("Equvalent octal Number" + bin1 + "is");
	for(j=i-1; j>0;j--)
	{
		System.out.println(oct[j]);
	}
	
}
}
