package deadlockexa;

public class A {

	
	// Need A lock
	public synchronized void funa(B b ){
		
	       	   System.out.println("Before thraed lock in A");
		
	       	   // B lock need
	           b.fun2();
	           
	           
	           System.out.println("after dead lock in A");
	}
	
	
	public synchronized void fun1() {
		System.out.println("Inside fun1");
	}
}
