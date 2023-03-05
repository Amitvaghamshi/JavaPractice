package com.masai.prc;

public class Producer extends Thread{

	Common c;
	Producer(Common c){
		this.c=c;
	}
	
	@Override
	public void run() {
		
		int i=0;
		while(true) {
			c.produce(i);
			i++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
