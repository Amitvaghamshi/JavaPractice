package racecondition;

public class Demo {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		  for(int i=0;i<100;i++) {
			       if(i==25) {
			    	   synchronized(new ThreadA()) {
			    		   Thread.currentThread().wait();
					   }
			    	     
			       }
			       System.out.println(i+" "+Thread.currentThread().getName());
		  }
		
	}
}

