package logical;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListtoSet {

	public static void main(String[] args) {
		List<Integer> i=new ArrayList<Integer>();
		i.add(10);
		i.add(11);
		i.add(11);
	
		System.out.println(i);

	
	Set<Integer> s=new LinkedHashSet<Integer>(i);
 	//i.clear();
    // i.addAll(s);
   System.out.println(s);
}
}
