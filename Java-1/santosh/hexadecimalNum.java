package santosh;
import java.util.*;
public class hexadecimalNum {
 public static void main(String[] args) {
	int Dec_num,rem;
	String Hex_num="";
	char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the decimal Number=");
	Dec_num=in.nextInt();
	while(Dec_num>0) {
		rem=Dec_num%16;
		Hex_num = hex[rem] + Hex_num;
        Dec_num = Dec_num/16;
	}
	System.out.print("Hexadecimal number is : "+Hex_num+"\n");         

}
}
