package protected1;
class Test2{
	final public void finalTest() {
		System.out.println("Test2 final implementation");
	}
}

 class NewTest extends Test2{
	
}
abstract class Test {
	public abstract void testFunc();
}

class NewClass extends Test{

	@Override
	public void testFunc() {
		System.out.println("the abstract class implemented");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		Test t = new NewClass();
      	t.testFunc();
		Test2 t1 = new Test2();
		t1.finalTest();
		NewTest t2 = new NewTest();
		t2.finalTest();
	}

}
