package multithreading;

public class ThraedA extends Thread{
	
	String name;
	
	Common c;
	ThraedA(Common c){
		this.c=c;
	}
	
	
   @Override
   public void run() {
	   c.fun1("amit");
   }
	
}
