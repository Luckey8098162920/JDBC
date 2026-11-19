package b745;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import Studentmodel.Student;
import utility.DBconnection;

public class Studentdao implements Studentinterface {
Connection con=null;
	public  void insertstudentss(Student s) {
		// TODO Auto-generated method stub
	
       try {
    	con=   DBconnection.getconnection();
    	Class.forName("com.mysql.cj.jdbc.Driver"); //loading
    	
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b745","root","root");
//    	Statement st=con.createStatement();
    	PreparedStatement ps=con.prepareStatement("insert into studentss values(?,?,?)");
    			ps.setInt(1,s.getId() );
    			ps.setString(2,s.getName());
    			ps.setInt(3,s.getMarks());
    			
    	
    	int n=ps.executeUpdate();
    	if(n>0) {
    		System.out.println(n+"rows effected");
    	}else {
    		System.out.println("somethig wrong");
    	}
    con.close();
       }catch(Exception e) {
    	   System.out.println(e);
       }
	}
	public void getstudents() {
		try {
			con= DBconnection.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from studentss");
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	@Override
	public void getstudentss() {
		// TODO Auto-generated method stub
		
	}
	//@Override
//	public void insertstudentss(Student s) {
//		// TODO Auto-generated method stub
//		
//	}

}
