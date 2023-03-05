package com.masai.prc;

public class Common {

	int i=0;
	
	boolean flag=true;
	
	public void produce(int i){
		
		synchronized (this) {
			
			
			
			 this.i=i;
			 System.out.println("Produced value "+i);
			 flag=false;
			 notify();
			
		}
		
		  
	}
	
	
	
	public void consume() {
		
		synchronized (this) {
			
			if(flag==true) {
				 try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("Consume value "+i);
			flag=true;
			notify();
		}
		
		
	}
}
