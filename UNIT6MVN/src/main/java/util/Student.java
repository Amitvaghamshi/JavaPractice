package util;

import java.io.Serializable;

public final class Student implements Serializable{

	
	  private volatile static Student s;
	  
	  private Student() {
		  if(s!=null) {
			  throw new RuntimeException("NOt possible");
		  }
	  }
	  
	  public Object readResolve() {
		  return s;
	 }
	  
	  
	  public synchronized  static  Student getStudent(){
		  
		  
		  
		  if(s==null) {
			  return new Student();
		  }
		  
		  return s;
	  }
	  
	  
	
	   public void fun() {
		    System.out.println("HEllo world");
	   }
}
