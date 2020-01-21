package santosh;
import java.util.*;

public class linkedListDemo {
 public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("Enter Price");
	list.addFirst("1000");
	list.addLast("2000");
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
