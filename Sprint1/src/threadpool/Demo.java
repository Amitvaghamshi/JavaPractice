package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		
		PrintName p1=new PrintName("amit");
		PrintName p2=new PrintName("asish");
		PrintName p3=new PrintName("Empty");
		
		  ExecutorService ex=Executors.newFixedThreadPool(3);
		  ex.submit(p1);
		  ex.submit(p2);
		  ex.submit(p3);
	}
}
