package functionalprogramming;

public class Demo {
	
	dummy  de=System.out::println;

	public static void main(String[] args) {
		Demo d=new Demo();
		d.de.get();
	}
	

}
