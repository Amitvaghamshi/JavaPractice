package multithreading;

public class ThA extends Thread{

	  A a;
	  B b;
	  ThA(A a,B b){
		  this.a=a;
		  this.b=b;
	  }
	  
	  @Override
	public void run() {
		a.funA(b);
	}
}
