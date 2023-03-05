package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Student;
import util.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String saveStudent(Student st) throws SQLException {
		
		String add="Not";
		
		Connection conn=DBUtil.getConnection();
		
		PreparedStatement stm= conn.prepareStatement("insert into student values(?,?,?,?,?)");
		stm.setInt(1, st.getRoll());
		stm.setString(2, st.getName());
		stm.setString(3, st.getAddress());
		stm.setString(4, st.getEmail());
		stm.setString(5, st.getPass());
		
		int zx= stm.executeUpdate();
		System.out.println(zx);
		if(zx>1) {
			add="YES";
		}else {

		}
		
		
		
		
		
		return add;
		
	}

	
}
