package logical;

public class palindromString {

	public static void main(String[] args) {
		 System.out.println("Is aaa palindrom?: " + isPalindrom("aaa"));

	}
	public static Boolean isPalindrom(String str)
	{
		String reverse= reverse(str);
		if(str.equals(reverse))
		{
			return true;
			
		}
		return false;
		
	}
	private static String reverse(String input) {
		if(input == null || input.isEmpty()){
            return input;
        }
       
        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }
}
