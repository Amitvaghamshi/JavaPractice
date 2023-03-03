package com.masai.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Iterator {

	    
	public static void main(String... args){
		
//		List<Integer> lis= new ArrayList<>();
//		lis.add(1);
//		lis.add(2);
//		lis.add(3);
//		lis.add(4);
//		lis.add(4, 12);
//		boolean b= lis.contains(10);
//		
//		System.out.println(b);
//		
//		System.out.println(lis.subList(1, 5));
//		
//		java.util.Iterator<Integer> itr=lis.iterator();
//		
//		String str1="abcd";
		//String str1=new String("");
	//	String str2=str1;
		
		
//		String str1=new String("abcd");
//		String str2=new String("abcd");
		
		//System.out.println(str1.hashCode());
		//System.out.println(str2.hashCode());
		
		
		//   ex++ ,ex--,++ex,--ex  
		
		//  |        ||
		
//		int x=5;
//		
//		if(x++==5 | x++==6) {
//		      
//			   
//		}
		
//		System.out.println(x);
		
//		Queue<Integer> q=new LinkedList<>();
//		
//	     ArrayDeque<Integer> dq=new ArrayDeque<>();
		
//		Set<Integer> set=new HashSet<>();
//		
//		set=new LinkedHashSet<>(lis);
//		set=new TreeSet<>(lis);
//		set.add(10);
//		set.add(42);
//		set.add(12);
//		set.add(9);
//		java.util.Iterator<Integer> itr2=set.iterator();
//		
//		while(itr2.hasNext()) {
//		//	System.out.println(itr2.next());
//			Integer val=itr2.next();
//			if(val==42) {
//				itr2.remove();
//			}
//		}
//		System.out.println(set);
		
		
		
//		TreeSet<Student> set=new TreeSet<>();
//		set.add(new Student("amir", 203));
//		set.add(new Student("amir", 210));
//		set.add(new Student("dshish", 203));
//		set.add(new Student("kelo", 203));
//		set.add(new Student("thatur", 203));
//		set.add(new Student("chaman", 203));
//		
//		for(Student st:set) {
//			 System.out.println(st);
//		}
		
	    //	System.out.println(set);
		
		Student s1=new Student("amir", 210);
		Student s2=new Student("amir", 210);
		
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		
	}
}
