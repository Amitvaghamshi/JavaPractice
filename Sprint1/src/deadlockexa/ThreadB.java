package deadlockexa;

public class ThreadB extends Thread{

	A a;
	B b;
	
	
	ThreadB(A a,B b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void run() {
		 b.funb(a);
	}
	
	
	
	
}
