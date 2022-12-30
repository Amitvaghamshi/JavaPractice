package threadpool;

import java.util.concurrent.Callable;

public class CallableInterface implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=0;i<=10;i++){
			sum+=i;
		}
		return sum;
	}

	
}
