package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class P2 {

	
	
	public static void main(String[] args) {
		
		
		

		 Predicate<Integer> d=new Predicate<Integer>(){

			@Override
			public boolean test(Integer t) {
				
				if(t<500) {
					return false;
				}
				
				
				return true;
			}
		 };
		 
		 
		 Predicate<Integer>  s=m->m>=500;
		 
		 
		 System.out.println(s.test(300));
		 
		 
		 List<Integer> li= new ArrayList<>();
		 li.add(23);
		 li.add(453);
		 li.add(265);
		 li.add(5433);
		 li.add(2456);
		 
		 li.removeIf(s);
		 
		 System.out.println(li);
		 
		
		Consumer<Integer> con=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				
				System.out.println(t+500);
			}
		};
		 
		
//		List<Integer> li= new ArrayList<>();
//		 li.add(23);
//		 li.add(453);
//		 li.add(265);
//		 li.add(5433);
//		 li.add(2456);
//		 
//		 
//		 li.forEach(s->System.out.println((float)s/987654));
//		 
//
//		 Supplier<Integer> sp=new Supplier<Integer>() {
//			
//			@Override
//			public Integer get() {
//				return 300;
//			}
//		};
//		
//		System.out.println(sp.get());
		 
		 
		 
		Function< Integer, Integer> x=new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t%10;
			}
		};
		
		System.out.println(x.apply(3456));
		
		
		
		
	}
}
