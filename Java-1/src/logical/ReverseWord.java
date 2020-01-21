package logical;

public class ReverseWord {

	public static void main(String[] args) {
//		String s="Welcome To the Word";
//		String str[]=s.split(" ");
//		for (int  i =str.length-1; i>=0; i--) {
//			
//			System.out.println(str[i]);
		
	String str1="Sanla   is  as  a aa a";
	char[] chars=str1.toCharArray();
	StringBuffer sb=new StringBuffer();
	for (int i = 0; i < chars.length; i++) {
		if((chars[i]!=' ') && (chars[i]!='\t'))
		{
			sb.append(chars[i]);
		}
	}
	System.out.println(sb);
		
		}
	}

//}
