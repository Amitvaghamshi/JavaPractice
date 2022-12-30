package multithreading;

public class Common {

	public static synchronized void fun1(String name) {
		   System.out.println("welcome");
		   
		   
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		   System.out.println(name);
		   
		   
	}
}
