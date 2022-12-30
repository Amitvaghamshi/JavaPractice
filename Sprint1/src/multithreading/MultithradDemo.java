package multithreading;

public class MultithradDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Common c=new Common();
		Common d=new Common();
		
		ThraedA a=new ThraedA(c);
		ThraedB b=new ThraedB(d);
		a.start();
		b.start();
		//b.sleep(2);
	}
}
