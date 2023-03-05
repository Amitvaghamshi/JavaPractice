package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	
	public static Connection getConnection() {
		
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/eval";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try{
			conn=DriverManager.getConnection(url,"root","5645");
			
			
		} catch (Exception e) {
			e.getCause();
		}
		return conn;
		
	}

	
}
