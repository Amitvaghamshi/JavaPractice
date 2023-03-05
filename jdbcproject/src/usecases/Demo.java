package usecases;

import java.sql.SQLException;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;

public class Demo {

	public static void main(String[] args) throws SQLException {
		
		
		
		Student s=new Student(12, "gamm ma eav", "Dhari", "email", "pass");
		
		StudentDao dao=new StudentDaoImpl();
	    String x=	dao.saveStudent(s);
	    System.out.println(x);
		
	}
}
