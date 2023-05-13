package multithreading;

public class ThreaA extends  Thread{

	int total=0;
	@Override
	public void run() {
	
		  
		  for(int i=0;i<=10000;i++) {
			  
			  total+=i;
			  if(i==50) {
				  synchronized(this) { 
					  
					  notify();
				  }
			  }
		  }
		   
		 
		  
	}

}
