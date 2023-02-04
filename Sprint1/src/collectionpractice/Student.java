package collectionpractice;

import java.util.Objects;

public class Student {
    int roll;
    String name;
    String add;
	public Student(int roll, String name, String add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(add, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(add, other.add) && Objects.equals(name, other.name) && roll == other.roll;
	}
	
	
    
    
}
