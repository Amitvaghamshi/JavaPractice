package Casting;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fun {

	public static void main(String[] args) {
		
//		  Comparator<Integer> cpm=(a,b)->{
//			    if(a>b) {
//			    	return 1;
//			    }else {
//			    	return -1;
//			    }
//		  };
//		  
//		  Intr itr=System.out::println;
//		  
//		  itr.print("eff4f4");
		  
		  List<String> list=new ArrayList<>();
		  
		  list.add("dewfergre");
		  list.add("dfergre");
		  list.add("dewfwfqrfrgre");
		  list.add("dewferggrg");
		  list.add("dewfee");
		  list.add("dewfgre");
		  
		  
		Optional<Integer> inr= list.stream().map(t -> t.length()).max((a,b)->a>b?1:-1);
		 System.out.println(inr.get());
				  
	}
	
	
}
