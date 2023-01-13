package Filepracice;

import java.io.Serializable;

public class Student implements Serializable{

   transient static String name;
	int id;
	int mark;
	
	public Student(String name, int id, int mark) {
		super();
		this.name = name;
		this.id = id;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mark=" + mark + "]";
	}
	
	
	
	
	
}
