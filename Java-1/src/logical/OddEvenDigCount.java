package logical;

public class OddEvenDigCount {

	public static void main(String[] args) {
		int i=211;
		int evencount=0, oddcount=0;
		while(i>0)
		{
			int rem=i%10;
			if(rem%2==0)
			{
				evencount++;
				
			}
			else
            oddcount++;
			i=i/10;
		}
		System.out.println("Even Count=="+ evencount);
		System.out.println("Odd count=="+oddcount);
	}
}
