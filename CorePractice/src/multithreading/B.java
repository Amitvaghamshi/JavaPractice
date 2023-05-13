package multithreading;

public class B {
	
//	A a;
//	B(A a){
//		this.a=a;
//	}
	
	
	synchronized void  funb(A a){
		  System.out.println("Hello world by thread b");
		  a.Ba();
	}

	synchronized void xd() {
		   System.out.println("Hello World ");
	}
	
	  
}
