package com.masai.prc;

public class Demo {

	public static void main(String[] args) {
		
		Common c=new Common();
		
		Producer pt=new Producer(c);
		Consumer ct=new Consumer(c);
		
		pt.start();
		ct.start();
		
	}
}
