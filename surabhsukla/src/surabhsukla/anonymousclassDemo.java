package surabhsukla;
class greeting{
	public void say()
	{
		System.out.println("Hello");
	}
}

class sead{
	greeting g=new greeting() {
		public void say() {
			System.out.println("Namaste");
		}
	};
}

public class anonymousclassDemo {

	public static void main(String[] args) {
		sead s1=new sead();
		s1.g.say(); 
	}

}
