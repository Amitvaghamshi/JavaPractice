package com.masai.lock;

public class B {

	A a;
	
	
	synchronized void funB() {
		System.out.println("Inside Fun B started");
		a.funA();
		System.out.println("Inside Fun B ended");
	}
}
