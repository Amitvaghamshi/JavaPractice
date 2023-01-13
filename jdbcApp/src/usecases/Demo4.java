package usecases;

import java.util.List;

import dao.StudentDao;
import dao.StudentdaoImpl;
import model.Student;

public class Demo4 {

	public static void main(String[] args) {
		  StudentDao dao=new StudentdaoImpl();
		  List<Student> li=dao.getAllStudent();
		  
		  li.forEach(s->{
			  System.out.println(s);
		  });
	}
}
