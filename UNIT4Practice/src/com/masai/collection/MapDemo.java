package com.masai.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,Student> map=new HashMap<>();
		
		map.put(1, new Student("amti",3));
		map.put(2, new Student("super",4));
		map.put(3, new Student("chaman",5));
		map.put(4, new Student("somya",7));
		map.put(5, new Student("harit",8));
		map.put(6, new Student("harit",9));
		
		System.out.println(map);
		
//		 private Comparator<Student> c =new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//			
//		};
		
		Set<Map.Entry<Integer, Student>> set=map.entrySet();
		
	    List<Map.Entry<Integer, Student>> lis=new ArrayList<>(set);
	    
	    Collections.sort(lis,new sortByStudent());
	    
		
		for(Map.Entry<Integer, Student> x:lis) {
			//  System.out.println(x);
		}
		
		
		Map<Integer, Student>  sts=new TreeMap<>(new sortByRoll());
		sts.putAll(map);
		System.out.println(sts);
	
		
	}
}


class sortByStudent implements Comparator<Map.Entry<Integer, Student>>{

	@Override
	public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
		  if(o1.getValue().getName().compareTo(o2.getValue().getName())>0) {
			  return 1;
		  }else if(o1.getValue().getName().compareTo(o2.getValue().getName())<0){
			  return -1;
		  }
		  
		  return o1.getValue().getMarks()>o2.getValue().getMarks() ?1:-1;
	}
	
}


//class sortByRoll implements Comparator<Map.Entry<Integer, Student>>{
//
//	@Override
//	public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
//		 
//		  
//		  return o1.getValue().getMarks()<o2.getValue().getMarks() ?1:-1;
//	}
//	
//}

class sortByRoll implements Comparator<Integer>{

	@Override
	public int compare(Integer  o1, Integer o2) {
		  return o1>o2 ?-1:1;
	}
	
}
