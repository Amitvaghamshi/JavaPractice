package threading;

public class Demo {
	
	public static void main(String[] args) {
		
		Common c=new Common();
		Common c2=new Common();
		
		T1 t1=new T1(c);
		T2 t2=new T2(c2);
	
		t2.start();
		t1.start();
		
	}
}
