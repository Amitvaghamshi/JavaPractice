package com.masai.prc;

public class Consumer extends Thread{
	
	
	Common c;
	Consumer(Common c){
		this.c=c;
	}
	
	@Override
	public void run() {
		
		while(true) {
			c.consume();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
