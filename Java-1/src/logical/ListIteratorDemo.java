package logical;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String[] args) {
	LinkedList i=new LinkedList();
	i.add("Bala");
	i.add("Kala");
	i.add("Mala");
	System.out.println(i);
	ListIterator itr= i.listIterator();
	while(itr.hasNext())
	{
		String s =(String)itr.next();
		if(s.equals("Mala"))
     {
	    itr.remove();
     }
		
		if(s.equals("Mala"))
     {
	    itr.add("Shan");
     }
		
	}
	System.out.println(i);
}
}
