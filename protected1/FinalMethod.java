package protected1;

public class FinalMethod {
          final void demo()
          {
        	  System.out.println("you are in Finalclass");
          }
          }

          class A extends FinalMethod {
        	  public static void main(String args[])
        	  {
        		  A obj=new A();
        		  obj.demo();
        	  }
          }
