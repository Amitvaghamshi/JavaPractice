package multithreading;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		   ThreaA ta=new ThreaA();
		   ta.start();
		   synchronized (ta){
			    ta.wait();
		   }
		   System.out.println(ta.total);
		   
	}

}
