package multithreading;

public class Multithreadindemo {
	
	public static void fun1() {
		for(int i=0;i<=10;i++)
		System.out.println("inside fun1");
	}
	
	public static void fun2() {
		for(int i=0;i<=10;i++)
		System.out.println("inside fun2");
	}

	public static void main(String[] args) {
		 // System.out.println("amir");
		  
		  Thread t1=new Thread(Multithreadindemo::fun1);
		  Thread t2=new Thread(Multithreadindemo::fun2);
		  t1.start();
		  t2.start();
		  
		  
	}
}
