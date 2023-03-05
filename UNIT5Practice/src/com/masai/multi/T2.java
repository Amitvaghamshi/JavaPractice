package com.masai.multi;

public class T2 extends Thread{

	@Override
	public void run() {
	
		  for(int i=0;i<10;i++) {
			  
			  System.out.println(i);
		  }
	}

	
}
