package surabhsukla;

/*class vehical{
	int maxspeed=120;
}

class car extends vehical{
	int maxspeed=130;
	
	void display()
	{
		System.out.println("What is max speed="+ super.maxspeed);
	}
}

public class superKey {

	public static void main(String[] args) {
	
		car obj=new car();
		obj.display();

	}

}*/

class vehical{
	void person() {System.out.println("this is vehical class");
	}
}

/*class car extends vehical{
	void son() {
		System.out.println("this is Child class");
	}
	void display()
	{
		son();
	    super.person();
	}
}

public class superKey {

	public static void main(String[] args) {
	
		car obj=new car();
		obj.display();

	}

}*/


class man{
   man() {System.out.println("this is man cunstructor");
	}
}

class hatan extends man{
	hatan() {
		super();
		System.out.println("this is hatan constructor");
	}
	
}

public class superKey {

	public static void main(String[] args) {
	
		hatan obj=new hatan();


	}

}






















