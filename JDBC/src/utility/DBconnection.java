package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
 static Connection con=null;
	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //loading
	    	
	    	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b745","root","root");
		}catch(Exception e) {
			System.out.println(e);
		}
return con;
	}
	
}
