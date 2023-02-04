package been;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;


@Entity
@NamedQueries({@NamedQuery(name = "Student.getdata",query = "select s from Student s where id=:id") })
	
@NamedNativeQueries({
	@NamedNativeQuery(name = "amit",query = "select * from student",resultClass = Student.class),@NamedNativeQuery(name = "xyz",query = "select name form student")
})
public class Student {
     
	  
	  private String name;
	   @Id  
	  private int id;
	  private int marks;
	  
	  public Student() {
		  
	  }

	public Student(String name, int id, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	  
	  
}
