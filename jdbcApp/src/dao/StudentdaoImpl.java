package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.StudentNotFoundException;
import model.Student;
import utility.DButil;

public class StudentdaoImpl implements StudentDao {
	
	@Override
	public String insertStudentDetais(int roll, String name, String add, String mobile) throws StudentNotFoundException{
		
		
		String message="not added";
		
		try(Connection conn=DButil.getConnection()){
			
			PreparedStatement st= conn.prepareStatement("insert into student values(?,?,?,?)");
			st.setInt(1, roll);
			st.setString(roll, name);
			st.setString(3, add);
			st.setString(4, mobile);
			int x=st.executeUpdate();

			if(x>0) {
				message="aded";
			}else {
				throw new StudentNotFoundException("opps !");
			}
				
			
			}catch(SQLException e){
				throw new StudentNotFoundException("opps !");
			}
		return message;
	}

	@Override
	public String insertStudentDetais(Student student) {
String message="not added";
		
		try(Connection conn=DButil.getConnection()){
			
			PreparedStatement st= conn.prepareStatement("insert into student values(?,?,?,?)");
			st.setInt(1, student.getRoll());
			st.setString(2, student.getName());
			st.setString(3, student.getAdd());
			st.setString(4, student.getMobile());
			int x=st.executeUpdate();

			if(x>0) {
				message="aded";
			}
				
			
			}catch(SQLException e){
				System.out.println();
				message=e.getMessage();
			}
		return message;
	}

	@Override
	public int getMarkByRoll(int roll) {
		int marks=-1;
		
		
		try(Connection conn=DButil.getConnection()) {
			
			PreparedStatement st=conn.prepareStatement("select marks from student where roll= ?");
	    	st.setInt(1, roll);
		    ResultSet set= st.executeQuery();
		    
		    if(set.next()) {
		    	marks= set.getInt("marks");
		    }
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
		
		return marks;
	}

	@Override
	public List<Student> getAllStudent() {
		   List<Student> student=new ArrayList<>();
		   
		   try(Connection conn=DButil.getConnection()) {
				
				PreparedStatement st=conn.prepareStatement("select * from student");
			    ResultSet set= st.executeQuery();
			    
			     while(set.next()) {
			    	       Student obj=new Student();
			    	       obj.setRoll(set.getInt("roll"));
			    	       obj.setName(set.getString("sname"));
			    	       obj.setAdd(set.getString("address"));
			    	       obj.setMobile(set.getString("mobile"));
			    	       student.add(obj);
			     }
				
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		   
		   return student;
	}

	

	
}
