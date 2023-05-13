package racecondition;

public class Common {

		public void fun1(String name){
			synchronized(this){
					System.out.print("Welcome :");
					try {
					Thread.sleep(1000);
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
		    }
		}
}
