package More;

import java.util.Scanner;

public class Debt {

//	static char c;
	public static void main(String[] args) {
		
		 System.out.println("hello world");
		 Debt d=new Debt();
		 d.main(args);
		 
		 
		 
	}
	
	public static void foo() {
		System.out.println("Inside static Area");
	}
}


class  A extends Debt{
	  
	public static void main(String[] args) {
		 A a=new A();
		 a.foo();
		 
		 Scanner sc=new  Scanner(System.in);
		 boolean b=sc.nextBoolean();
		 System.out.println(b);
	}
	
	
}
