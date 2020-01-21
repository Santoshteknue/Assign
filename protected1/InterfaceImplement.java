package protected1;
interface ITest{
	public void firstExample();
	public void secondExample();
	
}

interface ITest1 extends ITest{
	public void thirdExample();
}

class FinalTest implements ITest1{

	@Override
	public void firstExample() {
		System.out.println("first example implemenmted");
		
	}

	@Override
	public void secondExample() {
		System.out.println("second example implemeted");
		
	}

	@Override
	public void thirdExample() {
		System.out.println("third example implemeted");
		
	}

}
public class InterfaceImplement {

	public static void main(String[] args) {
		FinalTest t= new FinalTest();
		t.firstExample();
		t.secondExample();
		t.thirdExample();
		

	}

}
