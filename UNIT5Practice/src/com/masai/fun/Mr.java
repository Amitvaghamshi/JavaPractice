package com.masai.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Mr {
	
	
	public  void pt(String str) {
		System.out.println(str);
	}
	
	Mr(){
		
	}
	
	Mr(String st){
		System.out.println(st);
	}

	public static void main(String[] args) {
		
		
		pr x=Mr::new;
		x.print("dfghj");
		
		pr xd=System.out::println;
		xd.print("hellllllll");
		
		
		Predicate<Integer> pre=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				
				if(t>10) {
					return true;
				}else {
					return false;
				}
			}
		};
		
		
		
		List<Integer> lis=new ArrayList<>();
		
		lis.add(1);
		lis.add(2);
		lis.add(11);
		lis.add(12);
		lis.add(6);
		
		lis.removeIf(a->a>10);
		
		System.out.println(lis);
		
	}
}
