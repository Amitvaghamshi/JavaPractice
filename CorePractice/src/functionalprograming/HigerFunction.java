package functionalprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HigerFunction {
	
	
	public static void main(String[] args) {
		
		Predicate<Integer> pr=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
			   return t>20?true:false;
			 }
			
			
		};
		
		
		// ptedicate
		Predicate<Integer> pr2=a->a>20?true:false;
		List<Integer> lis=new ArrayList<>();
		lis.add(1);
		lis.add(23);
		lis.add(345);
		lis.add(432);
		
		lis.removeIf(t->t%2==0?true:false);
		
		System.out.println(lis);
		
	    lis.forEach(System.out::println);
	    
		
		
	}

}
