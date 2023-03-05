package com.masai.lock;

public class Demo {
	
	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		
		ThreadA t1=new ThreadA(a, b);
		ThreadB t2=new ThreadB(a, b);
		
		t1.start();
		t2.start();
		
	}

}
