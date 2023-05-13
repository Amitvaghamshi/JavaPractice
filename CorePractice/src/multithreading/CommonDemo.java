package multithreading;

public class CommonDemo {

	public  static void main(String[] args) throws InterruptedException {
		
		
		   Common c=new Common();
		   Common c2=new Common();
		   Thread t1=new Thread(new R1(c));
		   Thread t2=new Thread(new R2(c2));
		
		   t1.start();
		   t2.start();
		   // t2.join();
	}
}
