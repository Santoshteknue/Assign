package protected1;
import java.sql.*;
public class DemoClass {

	public static void main(String[] args) throws Exception {
		String URL="jdbc:mysql://localhost:3307/dbname";
		String uname="root";
		String pass="root";
		String doctorid="d07";
		String doctorname="sameer";
		String query= "insert into doctor values (?,?,null,null)";
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(URL,uname,pass);
        PreparedStatement obj1=con.prepareStatement(query);
     //   Statement st= con.createStatement();
         obj1.setString(1,doctorid);
         obj1.setString(2, doctorname);
         
         
        int count= obj1.executeUpdate();
        System.out.println(count + "rows affect");
        obj1.close();
        con.close();
	}
	
}
