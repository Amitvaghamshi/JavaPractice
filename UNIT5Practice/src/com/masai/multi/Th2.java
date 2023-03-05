package com.masai.multi;

public class Th2 extends Thread{

	Common c;
	String s;
	
	Th2(Common c,String s){
		this.c=c;
		this.s=s;
	}

	@Override
	public void run() {
		c.fun1(s);
	}
	
	
}
