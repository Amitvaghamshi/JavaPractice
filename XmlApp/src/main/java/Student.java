import java.util.ArrayList;
import java.util.List;

public class Student {

	String name;
	int marks;
	String addr;
    School school;
    
    
	
	
	
	
	
	
	public Student(String name, int marks, String addr) {
		super();
		this.name = name;
		this.marks = marks;
		this.addr = addr;
	}
	
	public Student() {
		
	}


	public void distroy() {
		System.out.println("Distroy the student");
	}
	
	
	public void init() {
		System.out.println("Starat the student");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", addr=" + addr + ", school=" + school + "]";
	}

	

	
	
	
	
	
	
	
	
}
