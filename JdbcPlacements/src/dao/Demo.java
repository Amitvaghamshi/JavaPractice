package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn=DbUtil.ProvideConnectoon();
		
			  PreparedStatement st=	conn.prepareStatement(" insert into employee values(13,'tapu','Gujrart') ");
			  int x= st.executeUpdate();
			  System.out.println(x);
		  
			  PreparedStatement st2= conn.prepareStatement("select * from employee");
			  ResultSet set= st2.executeQuery();
			  while(set.next()) {
				  System.out.println(set.getInt("id")+" "+set.getString("name")+" "+set.getString("addr"));
			  }
	  
	  
	  
	}

}
