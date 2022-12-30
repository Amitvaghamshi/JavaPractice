package SyncBlock;

public class WaitNotify extends Thread{

	@Override
	public void run() {
		   for(int i=0;i<5;i++) {
			   System.out.println(i);
		   }
		  
//		   synchronized (this) {
//			  this.notify();
//		   }
		   
		   for(int i=5;i<=10;i++) {
			   System.out.println(i);
		   }
	}
}
