package Casting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Ana {

	
	public void  ans(List<String> arr,Stack<String> s,int index) {
		     
		if(s.size()!=0) {
			System.out.println(s);
		}
		
		for(int i=index;i<arr.size();i++) {
			//   swap
		}
	}
	
	
	
	public void swap(List<String> lis,int s,int e) {
		       String tamp=lis.get(s);
		       lis.set(s, tamp);
		       lis.set(e, tamp);
	}
	
	  public static void main(String[] args) {
		
		  List<String > lis=new ArrayList<>();
		   lis.add("amit");
		   lis.add("ashish");
		   lis.add("magan");
		   lis.add("tapu");
		   lis.add("tapu");
		   
		 
		   Map<String,Integer> map=new HashMap<>();
		   
		   for(int i=0;i<lis.size();i++) {
			      if(map.containsKey(lis.get(i))) {
			    	  map.put(lis.get(i), map.get(lis.get(i))+1);
			      }else {
			    	 map.put(lis.get(i), 1);
			      }
		   }
		   
		   
		   int max=0;
		   
		   String ans=null;
		   
		   for(Map.Entry<String , Integer> x:map.entrySet()) {
			      if(x.getValue()>max) {
			    	  max=x.getValue();
			    	  ans=x.getKey();
			      }
		   }
		   
		   System.out.println(ans);
		   
		   
	}
}
