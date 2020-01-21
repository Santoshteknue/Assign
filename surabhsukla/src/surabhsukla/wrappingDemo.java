package surabhsukla;

import java.util.ArrayList;

public class wrappingDemo {  ////////////////Autoboxing: Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. 
public static void main(String[] args) {
/*	char ch='a';
	Character a=ch;
	ArrayList<Integer> array=new ArrayList<Integer>();
	array.add(25);
	System.out.println(array.get(0));
}
}

//Java program to demonstrate Unboxing 

public class wrappingDemo{
	public static void main(String[] args) {
		Character ch='a';
		char a=ch;
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(24);
		System.out.println(array.get(0));
	}
}*/
	
	/*
	byte b=1;
	Byte byteobj=new Byte(b);
	System.out.println("Byte object byteobj"+byteobj);
	
	byte bv=byteobj;
	System.out.println("byte value, bv:"+bv);
	
	Integer I=Integer.valueOf(130);
	System.out.println(I.byteValue());
	System.out.println(I.doubleValue());
	
	int i=Integer.parseInt("10",5 );
	System.out.println(i);
	long l=Long.parseLong("1111",4);
	System.out.println(l);*/
	
	
	Integer i=new Integer(10);
	String s=i.toString();
	System.out.println(s);
	
	String s1=Integer.toString(10);
	System.out.println(s1);
	
	String s2=Character.toString('c');
	System.out.println(s2);
	
	
	
	
	
	
}
}

