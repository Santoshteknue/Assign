package surabhsukla;

public class genericArray {
	public <e> void printArray( e [] s)
	{
		for(e x:s)
			System.out.println(x);
	}
 public static void main(String[] args) {
	genericArray g1 = new genericArray();
	String country[]=new String[] {"indian", "US"};
	Integer number[]= {12,22,12,13};
	g1.printArray(country);
	g1.printArray(number);
}
}
