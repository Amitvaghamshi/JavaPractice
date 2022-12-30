package multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LiskedListDemo {

	Queue<Integer> li=new LinkedList<>();
	
	public synchronized void add() {
		
		  while(li.size()!=10){
			  li.offer(1);
		  }
	}
	
	public synchronized void remove() {
		while(li.size()!=0) {
			li.poll();
		}
	}
	
	public static void main(String[] args) {
		LiskedListDemo obj=new LiskedListDemo();
		
		Thread t1=new Thread(obj::add);
		Thread t2=new Thread(obj::remove);
		
		t1.start();
		t2.start();
		
		System.out.println("amit");
		
		// Loop will go infinity
	}
}
