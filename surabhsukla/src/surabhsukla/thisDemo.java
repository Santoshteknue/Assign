package surabhsukla;
/*class Box{
	private int i,b,h;
	public void setDimenstion(int i,int b,int h) {
		this.i=i;
		this.b=b;
		this.h=h;	
	}
	
	public void sendBox()
	{
		giftTaker gf=new giftTaker();
		gf.acceptGift(this);
	}
	
}
public class thisDemo {
	public static void main(String[] args) {
		Box b1=new Box();
		
		//b1.sendBox();
	}

}*/

/*class thisDemo{
	int a;
	int b;
	
	thisDemo(){
		a=23;
		b=25;			
	}
	
	thisDemo Display() {
	System.out.println("a="+a +"\n"+ "b="+b);
	return this;
	}
	
	public static void main(String[] args) {
		thisDemo demo=new thisDemo();
		demo.Display();
	}
	*/
class thisDemo{
	int a;
	int b;
	
	thisDemo()
	{
		a=10;
		b=12;
		
	}
	
	void display(thisDemo obj)
	{
		System.out.println("a="+a +"\n"+ "b="+b);
	}
    
	void get()
	{
		display(this);
		
	}
	
	public static void main(String[] args) {
		thisDemo demo=new thisDemo();
		demo.get();
	}
	


	
}
