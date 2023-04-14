package threaddemo;

public class Common {

	public static int counter =0;
	
	
	public synchronized void incre() {
		System.out.println(counter++);
	}
	
	public synchronized void decre() {
		System.out.println(counter--);
	}
	
}
