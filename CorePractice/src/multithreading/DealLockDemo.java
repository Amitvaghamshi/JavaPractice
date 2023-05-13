package multithreading;

public class DealLockDemo {

	public static void main(String[] args) {
		  A a=new A();
		  B b=new B();
		  
		  ThA t1=new ThA(a,b);
		  ThB t2=new ThB(a,b);
		  
		  t1.start();
		  t2.start();
		  
		  
	}
}
