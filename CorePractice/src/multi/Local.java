package multi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Local {

	public static void main(String[] args) {
		
		
		LocalDate ld=LocalDate.parse("09/12/2000",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		LocalTime t=LocalTime.parse("10:22:54");
		
		LocalDate n=LocalDate.now();
		
		System.out.println(t);
		System.out.println(ld.getDayOfWeek());
		
		//Duration d= Duration.between(LocalDateTime.now(), LocalDate.now().plusDays(133));
		//Period p=Period.between();
		
		
		LocalDateTime ldt=LocalDateTime.now();
		

		
	    System.out.println(ChronoUnit.DAYS.between(ld, ldt.plusDays(23).plusMinutes(340000)));
	    
	    Deque<Integer> d=new LinkedList<>();
	    
		
	    int[] arr= {12,44,5,6,45,8,9,11};
	    int[] arr2= {12,44,4,6,45,8,9,111};
	    //Arrays.sort(arr);
	    
	//	System.out.println(Arrays);
		
	    
	    List<Integer> lis=new ArrayList<>();
	    lis.add(23);
	    lis.add(34);
	    lis.add(55);
	    
	    Iterator<Integer> itr=lis.iterator();
	    
	     System.out.println(lis.equals(lis));
	    Object[] arrd= lis.toArray();
	    for(Object c:arrd) {
	    	System.out.println(c);
	    }
		
//		int i=0;
//		while(true) {
//			System.out.println(i);
//			i++;
//			try {
//				Thread.sleep(1000 );
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	    
	    
	    TreeSet<Integer> se=new TreeSet<>((a,b)->a>b?-1:1);
	    
	    System.out.println("------------");
	    
	    List<Integer> l=new ArrayList<>();
	    l.add(1);
	    l.add(2);
	    l.add(3);
	    l.add(4);
	    l.add(5);
	    
	    //Collections.reverse(l);
	    Collections.rotate(l, l.size()-2);
	    System.out.println(l);
	    
		
	}
}
