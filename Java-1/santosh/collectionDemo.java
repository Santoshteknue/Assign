package santosh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       mapExample();
	}
 
	private static void mapExample() {
		//Dictionary concept of php: assoc_array. 
		Map<String, String> users = new HashMap<String, String>();
		try {
			users.put("phaniraj", "welcome123");//The uniqueness of the key is determined by the hashCode and the equals method of the object that is stored as key....
			users.put("kumar", "apple123");
			users.put("gopal", "test123");
			users.put("sumath", "simple123");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The no of users: " + users.size());
		Set<String> keys = users.keySet();
		for(String key : keys) {//Displays keys and its associated values....
			System.out.println("Username:" + key);
			System.out.println("Password: " + users.get(key));
		}
		System.out.println(users);//Displays all the elements as a string representation
	}
	
	
	
	
	
	
}
