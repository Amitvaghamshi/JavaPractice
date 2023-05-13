package racecondition;

public class ThreadA extends Thread{

	@Override
	public void run() {
		synchronized (this) {
			for(int i=25;i<=50;i++) {
			    System.out.println(i+" "+Thread.currentThread().getName());
		  }
		  notify();
		}
		  
	}
}
