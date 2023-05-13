package dao;

import java.sql.Connection;
import java.sql.Statement;

public class StatementDemo {
	
	public static void main(String[] args) throws Exception{
		
		Connection conn=DbUtil.ProvideConnectoon();
		Statement st=conn.createStatement();
		
		String name="khajur";
		String addr="sjd";
		int id=5;
	 	int x= st.executeUpdate("insert into employee values("+id+",'"+name+"','Gujrart') ");
	 	System.out.println(x);
	 	//st.executeq
		
	}

}
