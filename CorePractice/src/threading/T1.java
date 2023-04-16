package threading;

public class T1 extends Thread{
	
	Common c;
	
	T1(Common c){
		this.c=c;
	}

	@Override
	public void run() {
		c.hey();
	}

}
