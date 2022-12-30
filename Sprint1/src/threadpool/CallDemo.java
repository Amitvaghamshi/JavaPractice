package threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CallableInterface c=new CallableInterface();
		
		ExecutorService e=Executors.newFixedThreadPool(2);
		Future<Object> x= e.submit(c);
		System.out.println(x.get());
		
		
	}
}
