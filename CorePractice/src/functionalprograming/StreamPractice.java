package functionalprograming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		   
		
		
		List<Integer> list=Arrays.asList(323,424,14,53,23,5,78,85,43,2);
		
		
		List<Integer> str= list.stream().filter(a->a<100?true:false).collect(Collectors.toList());
		System.out.println(str);
		
		// terminal
		list.forEach(a->System.out.println("Do nothing"));
		
		long t= list.stream().count();
		System.out.println(t);
		
		Optional<Integer> min=list.stream().min((a,b)->a>b?1:-1);
		System.out.println(min.get());
		
		
		
		
	}
}
