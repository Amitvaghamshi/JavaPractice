package functionalprograming;

import java.io.PrintStream;

public class Main {
	
	Main(){
		System.out.println("Inside constructor");
	}

	public void print() {
		System.out.println("using object creation");
	}
	public static void main(String[] args) {
		   
		
		
		     Intr d1=new IntrImpl();
		     d1.sayhello();
		     
		     //  2nd way
		     Intr d2=new Intr() {
				
				@Override
				public void sayhello() {
					System.out.println("Hello by annnums inner class");
				}
			};
			
			d2.sayhello();
			
			// By lamda ex
			
			Intr d3=()->System.out.println("By lamda expression");
			d3.sayhello();
			
			
	    	Intr d4=new Main()::print;
	    	d4.sayhello();
	    	
	    	
	    	// Demo
	    	
	    	
	    	
			// predicate    -->  test   --> Boolean  -->  removeIf();
			// consumer     ---> Accept  --> Void    --> ForEach
			// supplier     -->  get     --> Any      --> 
			// Function     --> Apply    -->  Any       --> Map 
	    	
	    	
	    	
		
	}
}
