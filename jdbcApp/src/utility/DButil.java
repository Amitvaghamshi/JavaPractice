package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DButil {
	
	private static String driver;
	private static String url;
	private static String pass;
	private static String username;
	
	static {
		ResourceBundle rb=ResourceBundle.getBundle("dbdata");
		driver=	rb.getString("db.drivername");
		url=	rb.getString("db.url");
		pass=	rb.getString("db.password");
		username=	rb.getString("db.username");
	//	System.out.println(driver+" "+url+" "+pass+" "+username);
	}

	   public static Connection getConnection() {
		     Connection conn=null;
		     
		     try {
				Class.forName(driver);
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		     
		     
		    try {
				conn=DriverManager.getConnection(url,username , pass);
			} catch (SQLException e){
				e.printStackTrace();
			}
		     
		     return conn;
	   }
	
}
