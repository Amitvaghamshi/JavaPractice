package threadpractice;

public class A implements Runnable{
	int sum=0;
	
	
	
	public synchronized void print() {
		     
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		

		System.out.println("before");
		this.notify();
		
		for(int i=50;i<=100;i++) {
			System.out.println(i);
		}
		System.out.println("afetr");
	}
	
	@Override
	public  void run() {
		
		print();
	}
	
	

	
}
