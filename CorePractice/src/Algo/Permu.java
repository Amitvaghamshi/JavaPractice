package Algo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Permu {
	
	

	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(12);
		cal c1=new  cal("amit");
		cal c2=new  cal("asish");
		cal c3=new  cal("kelo");
		cal c4=new  cal("sumo");
		
	 Future<String> f1=	es.submit(c1);
	 Future<String> f2=	es.submit(c2);
	 Future<String> f3=es.submit(c3);
	 Future<String> f4=	es.submit(c4);
	 
	 
	 System.out.println(f1);
	 System.out.println(f2);
	 System.out.println(f3);
	 System.out.println(f4);
  	es.shutdown();
	}
}

class cal implements Callable<String>{
	
	String str;
	
	cal(String str){
		this.str=str;
	}

	@Override
	public String call() throws Exception {
		 return str+" is workig  on thread "+Thread.currentThread().getName();
	}
	
}
