package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class DbUtil {

	   public static Connection ProvideConnectoon() {
		       Connection conn=null;
		       
		       try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		       
		       String url="jdbc:mysql://localhost:3306/eval";
		       
		       try {
				conn=DriverManager.getConnection(url,"root","5645");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		       
		       return conn;
	   }
}
