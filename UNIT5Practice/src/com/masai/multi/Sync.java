package com.masai.multi;

public class Sync {

	public static void main(String[] args) throws InterruptedException {
		
		Common c=new Common();
		Common c2=new Common();
		
		Th1 a=new  Th1(c,"amit");
		Th2 b=new  Th2(c,"ashish");
		
		
	
		
		a.start();
		b.start();
		
		
		
	}
}
