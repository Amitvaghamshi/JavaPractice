package com.masai.multi;

public class Demo {
	
	public static void main(String[] args) {
		
		
//		int[] arr=new int[2];
//		arr[3]=4;
		
//		T2 t=new T2();
//		Thread th=new Thread(t);
//		th.start();
//		t.start();
		
		
//		Runnable r=new  Runnable() {
//			public void run() {
//							for(int i=0;i<10;i++) {
//								
//								if(i==5) {
//									  try {
//											Thread.sleep(100);
//										} catch (InterruptedException e) {
//											// TODO Auto-generated catch block
//											e.printStackTrace();
//										}
//								  }
//								
//					System.out.println(i);
//					System.out.println(Thread.currentThread().getName());
//					//System.out.println(1/0);
//				}
//			}
//			
//		};
//		
//	  
//		Thread th=new Thread(t);
//		th.setName("amit");
//		th.start();
//		
//		
//		
//		
//		for(int i=10;i<50;i++) {
//			System.out.println(i);
//		}
		
		
		
		
		ThreadA a=new ThreadA(Thread.currentThread());
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			
		}
		
		for(int i=31;i<60;i++) {
			System.out.println(i);
		}
		
		//System.out.println(Thread.currentThread());
		
	}
}
