package threadpool;

public class PrintName implements Runnable{
	
	String name;
	
	PrintName(String name){
		this.name=name;
	}

	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			synchronized (PrintName.class) {
				System.out.println("Hii "+name);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		System.out.println("Bas have pati gayu");
		System.out.println();
	}

	
}
