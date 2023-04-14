package multi;

import java.util.Objects;

public class s1 {

	int x;
	String name;
	public s1(int x){
		this.x=x;
	}
	
	
	
	public s1(int x, String name) {
		super();
		this.x = x;
		this.name = name;
	}



	public  int getx() {
    	System.out.println("super");

    	return x;
    }
	
	protected void gety() {
		System.out.println("protected");
	}



	@Override
	public int hashCode() {
		return Objects.hash(name,x);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		s1 other = (s1) obj;
		return Objects.equals(name, other.name) && x == other.x;
	}
	
	
	
	
	
//	public boolean equals(Object o) {
//		  if(o==null) {
//			  return false;
//		  }
//		  
//		  if(this==null) {
//			  return true;
//		  }
//		  if(this.getClass()!=o.getClass()) {
//			  return false;
//		  }
//		  
//		  s1 s=(s1)o;
//		  if(this.name.equals(s.name) && this.x==s.x) {
//			  return true;
//		  }else {
//			  return false;
//		  }
//	}
	
	
	
	
	
}
