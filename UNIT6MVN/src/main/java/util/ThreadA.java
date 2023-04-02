package util;

public class ThreadA extends Thread{

	  @Override
	public void run() {
		
		  Student s=Student.getStudent();
		  System.out.println( Thread.currentThread().getName()+" "+s.hashCode());
	}
}
