package com.masai.tp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		
		
		ExecutorService service=Executors.newFixedThreadPool(10);
		Ta a=new Ta();
		Tb b=new Tb();
		service.submit(a);
		service.submit(b);
		
		service.shutdown();
		
	}
}
