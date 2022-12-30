package deadlockexa;

public class ThreadA extends Thread{
	
	A a;
	B b;
	
	ThreadA(A a,B b){
		this.a=a;
		this.b=b;
	}
	
	

	@Override
	public void run() {
		a.funa(b);
	}
}
