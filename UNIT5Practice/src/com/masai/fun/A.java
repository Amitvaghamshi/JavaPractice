package com.masai.fun;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class A {
	
	
	public String fun1(Intr itr) {
		return "k";
	}
	
	public static void main(String[] args) {
		
		
		
		
//		Intr itr=new IntrImpl();
//		itr.hello();
//		
//		
//		Intr itr2=new Intr() {
//			
//			@Override
//			public void hello() {
//				System.out.println("Hello world by announums innner class");
//			}
//		};
//		
//		itr2.hello();
//		
//		
//		Comparator<Integer> comp=new Comparator<Integer>() {
//			
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1>o2?1:-1;
//			}
//		};
//		
//		
//		
//		// lamda ex
//		
//		Intr lam=()->System.out.println("Using Lamda ex");
//		lam.hello();
//		
//		
//		FindSum sum=(Integer... arr)->{
//			int s=0;
//			for(int x:arr) {
//				s+=x;
//			}
//			return s;
//		};
//		
//		System.out.println(sum.sum(1,2,4,5,6,6,1234));
//		
//		
//		String str="1,amit";
//		
//		String[] arr=str.split(",");
//
//		int a=Integer.parseInt(arr[0]);
//		String b=arr[1];
//		
//		System.out.println(a+" "+b);
//		
//		
//		A lc=new A();
//		lc.fun1(new Intr() {
//			
//			@Override
//			public void hello() {
//				// TODO Auto-generated method stub
//				System.out.println("PPPPP");
//			}
//		});
//		
//		
//		lc.fun1(()->System.out.println("OKKKKKKKKKKKK"));
	    	Consumer<Integer> cons=new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
//		
//		
//		
//		List<Integer> lis=new ArrayList<>();
//		
//		lis.add(1);
//		lis.add(2);
//		lis.add(3);
//		
//		lis.forEach(System.out::println);
		
		
		  
		cons.accept(10);
		
		
		Supplier<Integer> sp=new Supplier<Integer>() {
			
			@Override
			public Integer get() {
				
				return 1;
			}
		};
		
		
	int x=	sp.get();
	System.out.println(x);
	
	
	Function<Student, String> f=new Function<Student, String>() {

		@Override
		public String apply(Student t) {
			return t+"";
		}
		
	};
	
	
	
	String sx= f.apply(new Student("amit",10));
	System.out.println(sx);
		
		
	}

}
