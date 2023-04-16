package serializations;

import java.io.Serializable;

public class Student implements Serializable{

	int roll;
	String name;
	String addr;
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}
