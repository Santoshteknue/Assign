package surabhsukla;

public class stringReverse {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
      @SuppressWarnings("unused")
	String str="WELCOME";
      StringBuilder str2=new StringBuilder();
      str2.append(str);
      str2.reverse();
      System.out.println(str2);
	}*/
		
	@SuppressWarnings("unused")
	String str="GEMINI MAN";
	char chars[]=str.toCharArray();
	for(int i=chars.length-1; i>0; i--)
	{
		System.out.println(chars[i]);
	}
		
	}

}
