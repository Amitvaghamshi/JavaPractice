package com.masai.multi;

public class Common {
	
	

	  public  void fun1(String name) {
		  
		  synchronized (Common.class) {
			  
			try {
				wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			  System.out.println("Welcome");
			  
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  System.out.println(name);
		}
	  
		  
		  
		  
	  }
}
