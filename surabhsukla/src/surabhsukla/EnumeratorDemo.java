package surabhsukla;
import java.util.*;

public class EnumeratorDemo {
 public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	Vector v=new Vector();
	v.addElement("Mango");
	v.addElement("pinepappl");
	
	System.out.println(v);
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	{
		String s=(String)e.nextElement();
		System.out.println(s+" "+s.length());
	}
	 
}
}
