package SyncBlock;

public class A extends Thread{
	
	Common c;
	
	A(Common c){
		this.c=c;
	}

	
	@Override
	public void run() {
		c.fun1("amit");
	}
}
