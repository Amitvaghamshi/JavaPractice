package threadpractice;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		   A s1=new A();
		  
		   Thread t=new Thread(s1);
		   t.start();
		   
		   
		   synchronized (t){
			   t.wait(); 
		   }
		  
		  for(int i=10;i<20;i++) {
			  System.out.println(i);
		  }
		   
	}
}
