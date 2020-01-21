public class FirstAssignment {

	public static void main(String[] args) {
		//primitiveType();
		referenceVariable();
	    Abstactclass();

	}

	

	private static void referenceVariable() {
		Test t1 = new Test();
		System.out.println("the variable declared private should be called by object"+t1.j);
		System.out.println("the variable declared static can be called by clas name"+protected1.Test.);
		
	}

	private static void primitiveType() {
		int no =12;
	    String name = "viresh";
	    double d = 123.89;
	    char c ='a';
	    boolean b= true;
		System.out.println(no);
		System.out.println(name+d+c+b);
//		System.out.println(d);
//		System.out.println(c);
//		System.out.println(b);
	}

}