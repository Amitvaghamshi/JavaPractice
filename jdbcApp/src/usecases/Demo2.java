package usecases;

import dao.StudentDao;
import dao.StudentdaoImpl;
import model.Student;

public class Demo2 {

	public static void main(String[] args) {
		    StudentDao st=new StudentdaoImpl();
		    
		  Student s=new Student(29, "erds", "dfew", "erre");
		  String x=  st.insertStudentDetais(s);
		  System.out.println(x);
	}
}
