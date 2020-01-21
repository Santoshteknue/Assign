package protected1;

public class Operations{
		public static int DivideFunc(int a,int b) throws Exception{
			int result = a/b;
			return result;
		}
	}
	public class ExceptionHandling {

		public static void main(String[] args)  {
			try {
				int out = Operations.DivideFunc(3,0);
				System.out.println(out);
			} catch (Exception e) {
				System.out.println("divide by zero error");
			}
		}

	}

}
