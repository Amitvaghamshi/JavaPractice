package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButl {

	public static Connection   getConnection() {
		
		Connection conn=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/eval";
		
		try {
			
		   conn=DriverManager.getConnection(url, "root", "5645");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return conn;
		
	
	}
}
