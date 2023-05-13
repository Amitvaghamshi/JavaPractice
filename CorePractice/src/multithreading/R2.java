package multithreading;

public class R2 implements Runnable{

	Common c;
	
	R2(Common c){
		this.c=c;
	}

	@Override
	public void run() {
	
		c.hello();
	}
}
