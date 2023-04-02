import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Immutable {
	
	
	
	int a;
	String x;
	

	public static void main(String[] args) {
		
		int a=10;
		StringBuilder sb=new StringBuilder("abca");
		
		while(sb.charAt(0)==sb.charAt(sb.length()-1)) {
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length()-1);
		}
		
		System.out.println(sb);
		
		Immutable am=new Immutable();
		am.A();
		
		List<Integer>lis=new ArrayList<>();
		lis.add(23);
		
//	   Iterator<Integer> itr=lis.iterator();
//	   
//	   while(itr.hasNext()) {
//		   System.out.println(itr.next());
//	   }
		
		
		PriorityQueue<Integer> pk=new PriorityQueue<>();
		
		LinkedList<Integer> list=new LinkedList<>();
		
//		Hashtable<Integer, Integer> tb=new Hashtable<>();
//		tb.put(1, null);
		
//		System.out.println(tb);
		
	}
	
	
	public final void A() {
		  System.out.println("Hello world");
	}
	
    public final void A(int n) {
		
	}


	@Override
	public int hashCode() {
		return 365388856;
	}


    
}
