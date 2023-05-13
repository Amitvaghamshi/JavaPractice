package multithreading;
public class Common {

	public  void hello() {
		
		synchronized (Common.class) {
			
		
		
		   System.out.println("Hellow "+Thread.currentThread().getName());
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		   System.out.println("World");
		   
		}
	}
}
