package com.masai.threadcommunication;

public class Demo {

	public static void main(String[] args) {
		
		
		Th1 t=new Th1();
		t.start();
		
		//Demo d=new Demo();
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		synchronized (t){
			try {
				t.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(t.sum);
		
	}
}
