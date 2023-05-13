package multithreading;

public class ThB extends Thread{

	B b;
	A a;
	ThB(A a,B b){
		this.b=b;
		this.a=a;
	}
	@Override
	public void run() {
		b.funb(a);
	}
	
}
