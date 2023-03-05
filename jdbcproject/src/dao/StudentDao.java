package dao;

import java.sql.SQLException;

import model.Student;

public interface StudentDao {

	public String saveStudent(Student st) throws SQLException;
}
