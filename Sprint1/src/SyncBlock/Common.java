package SyncBlock;

public class Common {
	
	
	public void fun1(String name) {
		   System.out.println("welcome");
		   
		  synchronized (this) {
			  try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    	} 
		 
		   System.out.println(name);
	}

	
	
	public  void fun2() {
		System.out.println("inside fun2");
		
		synchronized(this) {
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("By Bye ");
		
	}

}
