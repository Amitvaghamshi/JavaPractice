package threading;

public class T2 extends Thread{

      Common c;
	
	T2(Common c){
		this.c=c;
	}

	@Override
	public void run() {
		c.hey();
	}
}
