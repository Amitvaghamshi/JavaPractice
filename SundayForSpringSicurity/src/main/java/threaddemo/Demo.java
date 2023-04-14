package threaddemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
	
		
	
		   List<Integer> lis=new ArrayList<>();
		   lis.add(123);
		   lis.add(453);
		   lis.add(463);
		   lis.add(743);
		   lis.add(673);
		   
		   if(lis.size()<2) {
			   throw new IllegalArgumentException("Array must have to element");
			   
		   }else {
			   Collections.sort(lis);
			   System.out.println(lis.get(lis.size()-2));
		   }
		
	}
}
