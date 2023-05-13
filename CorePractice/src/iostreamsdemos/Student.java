package iostreamsdemos;

import java.beans.Transient;
import java.io.Serializable;

public class Student implements Serializable{

	 String name;
	transient String addr;
	int marks;
	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", marks=" + marks + "]";
	}
	
	
	
	
}
