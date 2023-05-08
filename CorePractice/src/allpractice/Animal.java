package allpractice;

import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public  class Animal implements AutoCloseable{
	
	volatile String  name;

	public  Animal() {
			this.name = "Default Name";
	}

	// This is called a one argument constructor.
	public Animal(String name) {
			this.name = name;
	}

	public static void main(String[] args) {
			Animal animal = new Animal();
			animal.name="dfg";
			
			double f=98888888888888888888888888888888888888.9;
			String str=f+"";
			
			
		//	System.out.println(animal instanceof IND);
		//	System.out.println(f/0);
			System.out.println(f/0);
			
			Collection<Integer> col=new ArrayList<Integer>();
		    Set<Integer> s=new HashSet<>();
		    s.size();
		    
		    
		    List<Integer> l1=new ArrayList<>();
		    l1.add(1);
		    l1.add(2);
		    l1.add(3);
		    
		    
		    List<Integer> l2=new ArrayList<>();
		    l2.add(3);
		    l2.add(4);
		    l2.add(5);
		    
		    l2.contains(2);
		    l2.removeAll(l1);
		    
		    
		    int x=5;
		    System.out.println(x++);
		    
		    
		 //   System.out.println(l2);
		    
		    ListIterator<Integer> itr= l2.listIterator();
		    while(itr.hasPrevious()) {
		    	System.out.println(itr.previous());
		    }
			
		    
	}	
	
	
	public void xs(String s) {
	    //Animal(s);
		 class  hello{
	    	   Animal a;
	    	   
	    	   hello(){
	    		   ExecutorService ex=Executors.newFixedThreadPool(12);
	    		   //ex.submit();
	    		   
	    		   
	    		   
	    		 
	    	   }
		};
	}

	@Override
	public void close() throws Exception{
		Animal a=new Animal();
		a.close();
	}
	
}
