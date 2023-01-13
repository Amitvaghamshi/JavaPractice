package dao;

import java.util.List;

import exception.StudentNotFoundException;
import model.Student;

public interface StudentDao {

    public String insertStudentDetais(int roll,String name,String add,String mobile) throws StudentNotFoundException; 
    public String insertStudentDetais(Student student);
    public int getMarkByRoll(int roll);
    public List<Student> getAllStudent();
    
    
}
