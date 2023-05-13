package multithreading;

public class A {

//	B b;
//	A(B  b){
//		this.b=b;
//	}
	
	
    synchronized void funA(B b) {
    	System.out.println("Hello world by A");
    	b.xd();
    }
    
    synchronized  void Ba() {
    	System.out.println("Hello Word by b");
    }
    
}
