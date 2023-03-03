package com.masai.collection;

import java.util.ArrayList;
import java.util.List;

public class Cov {
	
	public static void main(String[] args) {
		
		
		
		      Number[] num=new Number[10];
		      
		      Integer[] arr={1,2,4,5,6,};
		      
		      num=arr;
		     // num[0]=1.12;
		      
//		      System.out.println("========");
//		      
//		      List<Integer> myInts = new ArrayList<Integer>();
//		      myInts.add(1);
//		      myInts.add(2);
//		      List< ? extends Number > myNums = myInts; //compiler error
//		      myNums.add(3.14); //heap polution
		      
		      
		      List<? super Number> lis=new ArrayList<Object>();
		      
		      lis.add(1);
		      
		      System.out.println(lis);
		      
		      lis.add(12.12);
		      
		      lis.get(1);
		     
		      
		      
//		      ArrayList<Number> arr2 = new ArrayList<>();
//		      arr2.add(10);
//		      arr2.add(50);
//		      arr2.add(30);
//		      List<? super Integer> myNums = arr;
//		      myNums.add(40);
//		    //  but for the statement
//		      Number num = myNums.get(0); //Compile Time Error
		
	}

}
