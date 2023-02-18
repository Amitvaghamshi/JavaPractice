package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Student;
import com.masai.model.StudentDto;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	  public Student findByMarks(Integer m);
	  public Student findByMarksAndName(Integer marks,String name);
	  
	  @Query("select name ,marks from Student where marks=?1")
	  public List<String> getNamefromStudent( Integer roll);
	  
	    
	  @Query("select  new com.masai.model.StudentDto(s.name,s.marks) from Student s where s.marks =?1 ")
	  public List<StudentDto> findByNMbyRoll( Integer marks);
	  
}
