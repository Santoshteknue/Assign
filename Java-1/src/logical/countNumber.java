package logical;

public class countNumber {

	public static void main(String[] args) {
		/*int num=12113;
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
       System.out.println(count);
	}*/
    
		System.out.println(countNum(121212));
}

	 static int countNum(int i) {
		// TODO Auto-generated method stub
		if(i==0)
			return 0;
		
		return 1+countNum(i/10);
	}
}