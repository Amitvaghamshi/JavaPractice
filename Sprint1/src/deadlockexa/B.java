package deadlockexa;

public class B {

	// B lock need
	public synchronized void funb( A a) {
		 System.out.println("Before thraed lock In B");
		
		// A lock need
		   a.fun1();
		
		   System.out.println("after dead lock in B");
	}
	
	public synchronized void fun2() {
		System.out.println("Inside fun2");
	}
}
