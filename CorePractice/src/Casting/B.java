package Casting;

public class B extends A{
	
	
    static int x;

	void funB() {
		System.out.println("Inside Fun B");
	}
	
	public static void main(String[] args) {
		
		   A a=new A();
		
		   B b=(B)a;
		   
		   b.funB();
		
		System.out.println(x);
		
	}
}
