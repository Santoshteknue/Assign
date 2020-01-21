package santosh;
import java.io.*;
 class vehicalInfo implements Serializable{
	 int vehicalnum;
	 String vehicalName;
	 
	 vehicalInfo(int vehicalnum,String vehicalName){
		 this.vehicalName=vehicalName;
		 this.vehicalnum=vehicalnum;
		 
	 }
	
}
public class SerializationDemo {
	
 public static void main(String[] args) {
	vehicalInfo bmw=new vehicalInfo(1212,"hondai");
	try {
		new SerializationDemo().serialize(new File ("D:\\inputoutput"), bmw);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
 public void serialize(File file, vehicalInfo instanaceofVehicalInfo) throws IOException {
	 FileOutputStream fileStream=new FileOutputStream(file);
	 ObjectOutputStream objects=new ObjectOutputStream(fileStream);
	 objects.writeObject(instanaceofVehicalInfo);
	 objects.close();
	 objects.flush();
	 
 }
}
