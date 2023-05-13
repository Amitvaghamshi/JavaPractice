package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Excecutors {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//ExecutorService ex=Excecutors.
		ExecutorService service=Executors.newFixedThreadPool(3);

		Callable<Integer> x=new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				return 10;
			}
		};
		
		
		Future<Integer> f= service.submit(x);
		System.out.println(f.get());
		
		service.shutdown();
		
	}
}
