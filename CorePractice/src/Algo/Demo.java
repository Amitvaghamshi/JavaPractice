package Algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
//		Given an n*m matrix which is sorted row-wise, you need to find the median of the matrix.
//
//		Median of a group of numbers is the middle element after they are sorted. Both n and m are guaranteed to be odd numbers, therefore there’s only one middle number.
//		Input:
//		1 2 3
//		3 3 4
//		1 1 2
//		
		find();
		
	}
	
	public static void find() {
		     int[][] arr=new int[3][3];
		     arr[0][0]=1;
		     arr[0][1]=2;
		     arr[0][2]=3;
		     arr[1][0]=3;
		     arr[1][1]=3;
		     arr[1][2]=4;
		     arr[2][0]=1;
		     arr[2][1]=1;
		     arr[2][2]=2;
		     
		    List<Integer> list=new ArrayList<>();
		    for(int i=0;i<arr.length;i++) {
		    	  for(int j=0;j<arr.length;j++) {
		    		     list.add(arr[i][j]);
		    	  }
		    }
		    
		    Collections.sort(list);
		    int mid=list.size()/2;
		    
		    System.out.println(list.get(mid));
		     
	}
	
	
}
