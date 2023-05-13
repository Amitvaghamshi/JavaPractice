package multithreading;

public class R1 implements Runnable{
	
	Common c;
	
	R1(Common c){
		this.c=c;
	}

	@Override
	public void run() {
	
		c.hello();
	}

}
