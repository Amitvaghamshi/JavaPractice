package com.masai.lock;

public class A {
	
	B b;
	
	
	
	synchronized void  funA() {
		System.out.println("Inside Fun A started");
		b.funB();
		System.out.println("Inside Fun A completed");
	}

}
