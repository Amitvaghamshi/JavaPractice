package collectionpractice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
public class Demo {

	public static void main(String[] args) {
//		    List<Integer> li=new ArrayList<>();
//		    li.add(1);
//		    li.add(2);
//		    li.add(3);
//		    li.add(4);
//		    li.add(5);
//		    
//		    li.add(1, null);
//		    
//		    ListIterator<Integer> itr=li.listIterator();
//		    
//		    while(itr.hasNext()) {
//		    	//System.out.println(itr.next());
//		    	try {
//		    		if(itr.next()==3) {
//			    		itr.remove();
//			    	}
//				} catch (NullPointerException e) {
//					System.out.println(e.getMessage());
//				}
//		    	
//		    }
		    
		 //   System.out.println(li);
		
		Student s1=new Student(4, "amit", "daro");
		Student s2=new Student(3, "kelo", "daro");
		Student s3=new Student(2, "ashish", "daro");
		Student s4=new Student(1, "sumo", "daro");
		Student s5=new Student(1, "sumo", "daro");
		
		Set<Student> st=new TreeSet<>((a,b)->{
			if( a.roll>b.roll) {
				return 1;
			}else {
				return -1;
			}
		});
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		//System.out.println(st);		
				
				
		for(Student s:st) {
			System.out.println(s);
		}
				
				
				
		
//		Deque<Integer> q=new ArrayDeque<>();
//		q.offerLast(2);
//		q.offerFirst(1);
//		
//		
//		System.out.println(q);
//		
		
		
		
		
		
		
	}
}
