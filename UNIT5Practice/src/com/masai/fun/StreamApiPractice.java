package com.masai.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPractice {
	
	public static void main(String[] args) {
		
		
		List<Student> lis=new ArrayList<>();
		lis.add(new Student("amit", 17));
		lis.add(new Student("ashish", 16));
		lis.add(new Student("kelo", 14));
		lis.add(new Student("popaiyo", 13));
		lis.add(new Student("tarbooch", 12));
		
		
		Stream<Student> st= lis.stream().map(s->{
			 s.marks=s.marks+50;
			 return s;
		});
		
		System.out.println(st.collect(Collectors.toList()));
		
		
	    List<Student> d=lis.stream().filter(s->{
			if(s.marks>65) {
				return true;
			}else{
				return false;
			}
		}).collect(Collectors.toList());
		
		System.out.println(d);
	}

}
