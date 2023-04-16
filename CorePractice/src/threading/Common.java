package threading;

public class Common {

	public void hey() {
		synchronized (Common.class){
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}
	}
}
