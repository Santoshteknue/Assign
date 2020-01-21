package surabhsukla;
abstract class demo{
	final void fun() {
		 System.out.println("A");
	 }
}

class test extends demo{
	 void fun1() {
		
		System.out.println("B");
	}
}


public class abstractDemo {
  public static void main(String[] args) {
	demo obj=new test();
	  obj.fun();
}
}
