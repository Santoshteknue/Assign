package surabhsukla;
public class JavaSetPriorityExp1  extends Thread
{
	
private void run()
{
	   System.out.println("thrad priority="+ Thread.currentThread().getPriority());	
    
}
	
}

public class threadPriorityDemo {
	public static void main(String[] args) {
		car p1=new car();
		p1.setPriority(Thread.MAX_PRIORITY);
		p1.start();
	}

}