package protected1;

import java.util.*;

public class MapDemo {
	public static void main(String args[])
	{
		mapExample();
	}

public static void mapExample()
{
	Map<String,String> obj=new HashMap<String,String>();
	obj.put("10", "Jaymin");
	obj.put("20", "Anirudh");
	obj.put("30", "Anirudh");
    obj.put(40, "Viresh");
	Set<Integer> obj1=obj.keySet();
	for(Integer p:obj1)
	{
		System.out.println("id is :"+p);
		System.out.println("name is :"+obj.get(p));
	}
}

}
