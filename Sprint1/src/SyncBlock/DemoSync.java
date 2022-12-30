package SyncBlock;

public class DemoSync{
   
    
    public static void main(String[] args) {
    	Common c=new Common();
    	A a=new A(c);
    	B b=new B(c);
    	
    	a.start();
    	b.start();
    	
	}
}
