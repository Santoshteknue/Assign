package surabhsukla;
import java.io.*;
public class iioFileDemo {
 @SuppressWarnings("resource")
public static void main(String[] args) throws IOException {
	FileOutputStream fout;
	fout=new FileOutputStream("C:\\Users\\santosh teknur\\Desktop\\JAVA\\santosh.txt" + true);
    //fout.createNewFile();
	String s="TATA";
	char ch[]=s.toCharArray();
	for(int i=0; i<s.length(); i++)
		fout.write(ch[i]);
	fout.close();
}
}
