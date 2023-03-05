package com.masai.lock;

public class ThreadB extends Thread{
	
	A a;
	B b;
	
	ThreadB(A a,B b){
		this.a=a;
		a.b=b;
		this.b=b;
		b.a=a;
	}

	@Override
	public void run() {
		
		b.funB();
		
	}
}
