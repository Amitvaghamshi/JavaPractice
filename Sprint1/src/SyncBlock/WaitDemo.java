package SyncBlock;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException{
		
		WaitNotify d=new WaitNotify();
		d.start();
		
		//Thread.sleep(1);
		
		synchronized (d) {
			d.wait();
		}
		
		
		
		for(int i=10;i<20;i++){
			System.out.println(i);
		}
		
	}
}
