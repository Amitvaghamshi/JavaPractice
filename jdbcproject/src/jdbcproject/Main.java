package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws  SQLException {
		  
	         //   1 st way
//		     Driver d=new Driver();
//		     DriverManager.registerDriver(d);
		     
		     //  2nd way
		     try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		                   
		     
		     //get connection
		     String url="jdbc:mysql://localhost:3306/first_database";
   
		      Connection conn=  DriverManager.getConnection(url,"root","5645");
		      System.out.println(conn);
		      
		      // AutoCloseable st=conn.createStatement();
		      Statement st = conn.createStatement();
		       
		      int n=st.executeUpdate("insert into student values(25,'bhavesh','lalpur','2378235')");
		      
		      System.out.println("ok");
		      
		      
	}
}

