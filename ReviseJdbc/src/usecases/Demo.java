package usecases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import dao.DButl;

public class Demo {

	public static void main(String[] args) throws SQLException {
		
		
		Connection conn=DButl.getConnection();
		
//		Statement st=conn.createStatement();
//		
//		String name="kelo";
//		int roll=14;
//		int marks=453;
		
		
//		int sts= st.executeUpdate("insert into student values("+roll+", '"+name+"',"+marks+" )");
//		
//	    System.out.println(sts);
		
//	   PreparedStatement pst=conn.prepareStatement("insert into student values(?,?,?)");
//	   pst.setInt(1, roll);    
//	   pst.setString(2, name);
//	   pst.setInt(3, marks);
//	   
//	   
//	   int nd= pst.executeUpdate();
//	   System.out.println(nd);
		
		
		PreparedStatement st=conn.prepareStatement("select * from student");
		
		ResultSet set= st.executeQuery();
		
		while(set.next()) {
			System.out.println(set.getString("id")+" "+set.getString("name")+" "+set.getString("marks"));
		}
		
	}
}

