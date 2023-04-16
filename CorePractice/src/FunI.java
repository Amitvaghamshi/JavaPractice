import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunI {
	 public static PrintStream out;
	
	public static void main(String[] args) {
		
		
		List<Integer> lis=new ArrayList<>();
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		
		
	
		
		Predicate<Integer> pre=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t%2==0) {
					return true;
				}else {
					return false;
				}
			}
		};
		
		
		lis.removeIf(a->a%2==1?true:false);
		
		lis.forEach(a->System.out.println(a*19));
		System.out.println(lis);
		
		
		
		Supplier<String> sup=new Supplier<String>() {
			
			@Override
			public String get() {
				return "heello world";
			}
		};
		
		
	   System.out.println(sup.get());
	   
	  
	//	FunI.out.println("fff");
	   
	   
	   Function<String, Integer> fun=new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
    	};

    	List<String> ls=new ArrayList<>();
    	ls.add("11");
    	ls.add("23");
    	ls.add("143");
    	ls.add("123");
    	
    	List<Integer> itr= ls.stream().map(a->Integer.parseInt(a)).collect(Collectors.toList());
    	System.out.println(itr);
    	
	   
	}

}
