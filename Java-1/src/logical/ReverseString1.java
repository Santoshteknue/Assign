package logical;

public class ReverseString1 {

	public static void main(String[] args) {
		System.out.println(Reverse("Santosh"));
	}

	private static String Reverse(String s) {
		if(s==null || s.length()<1)
		{
			return s;
		}
		return Reverse(s.substring(1))+s.charAt(0);
	}

}
