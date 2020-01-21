package surabhsukla;
import java.util.Scanner;

public class latitudeLongDemo {
   public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Input the latitude of coordinate 1: ");
	double lat1=scan.nextDouble();
	System.out.println("Input the latitude of coordinate 1: ");
	double lon1=scan.nextDouble();
	System.out.println("Input the latitude of coordinate 1: ");
	double lat2=scan.nextDouble();
	System.out.println("Input the latitude of coordinate 1: ");
	double lon2=scan.nextDouble();
	System.out.println("The distance between those points is: " +latlon(lat1, lon1, lat2, lon2));
	
}
   public static double latlon(double lat1, double lat2, double lon1, double lon2)
   {
	   lat1=Math.toRadians(lat1);
	   lon1=Math.toRadians(lon1);
	   lat2=Math.toRadians(lat2);
	   lon2=Math.toRadians(lon2);
	   
	   double earthRadius = 6371.01;
	   return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));

	   
   }
}
