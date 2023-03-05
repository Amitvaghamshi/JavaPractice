package com.masai.lock;

public class ThreadA extends Thread{
	
	A a;
	B b;
	
	ThreadA(A a,B b){
		this.a=a;
		a.b=b;
		this.b=b;
		b.a=a;
	}

	@Override
	public void run() {
		
		a.funA();
		
	}
}
