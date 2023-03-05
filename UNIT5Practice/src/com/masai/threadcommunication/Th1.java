package com.masai.threadcommunication;

public class Th1 extends Thread{
	
	int sum=0;

	    @Override
	    public void run() {
	    	synchronized (this) {
				
	    	
	    		for(int i=0;i<40000;i++) {
		    		sum+=i;
		    	}
		    	
	    	//	this.notify();
	    		
			}
	    }
	   
}
