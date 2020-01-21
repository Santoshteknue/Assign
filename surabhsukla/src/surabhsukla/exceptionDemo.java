package surabhsukla;

public class exceptionDemo {
	public static void main(String[] args) {
		try {
		int saving=2000;
		int current=5000;
		if(saving < current)
		throw new ArithmeticException("Insufficient balance");
		//saving=saving-current;
		System.out.println("transaction sufficient");
		     
		     
	}
		catch(ArithmeticException e)
		{
			System.out.println("Exception"+e.getMessage());
		}
		System.out.println("program continued");
	}
}
