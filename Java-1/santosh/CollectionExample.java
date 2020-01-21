package santosh;
import java.util.*;
class CollectionExample
{
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//ArrayList list = new ArrayList();
		list.add("sameer");
		list.add("shaikh");
		list.add("juber");
		list.add("kiran");
		list.add("asem");
		list1.add(123);
			
		Iterator<String> itr = list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.nextINT());
			}
	}
}