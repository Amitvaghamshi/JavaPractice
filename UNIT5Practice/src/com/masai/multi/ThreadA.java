package com.masai.multi;

public class ThreadA extends Thread{
	
	Thread t;
	
	int sum=0;
	
	
	public ThreadA(Thread t) {
		this.t=t;
	}


	@Override
	public void run() {
		
		findsum();
	}
	
	public synchronized int findsum() {
		
		for(int i=0;i<50;i++) {
			sum+=i;
		}
		return sum;
	}
	
}
