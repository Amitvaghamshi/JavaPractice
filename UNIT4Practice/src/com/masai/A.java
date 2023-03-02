package com.masai;

public class A {
	
	 int a=10;
	
     public void a1() {
    	 System.out.println("Inside A of a1");
     }
	 
     public  void  o(){
    	 System.out.println("Inside A of override");
     }
     
}

class B extends A{
	
	int b=20;
	
	public void b1() {
		System.out.println("Inside b1 of B");
	}
	   
	 @Override
	 public void  o() {
    	 System.out.println("Inside B of override");
     }
}
