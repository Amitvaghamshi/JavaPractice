package SyncBlock;

public class B extends Thread{
	
	Common c;
	
	B(Common c){
		this.c=c;
	}

	
	@Override
	public void run() {
		c.fun2();
	}

}
