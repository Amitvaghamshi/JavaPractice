package threaddemo;

public class ThB extends Thread{
	
		Common c;
		
		ThB(Common c){
			this.c=c;
		}
		
		
		@Override
		public void run() {
			  c.incre();
		}
		
		
	


}
