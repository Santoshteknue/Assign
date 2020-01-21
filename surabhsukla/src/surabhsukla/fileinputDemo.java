package surabhsukla;
import java.io.*;
public class fileinputDemo {
public static void main(String[] args) throws IOException {
	int i;
	FileInputStream fin= new FileInputStream("C:\\Users\\santosh teknur\\Desktop\\JAVA\\santosh.txt");
	do {
	i=fin.read();
	if(i!=-1)
		System.out.println((char)i);
	}while(i!=-1);
}
}
