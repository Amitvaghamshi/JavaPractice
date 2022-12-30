package multithreading;

public class ThraedB extends Thread{

	Common c;
	ThraedB(Common c){
		this.c=c;
	}
	
	
   @Override
   public void run() {
	   c.fun1("ashish");
   }
}
