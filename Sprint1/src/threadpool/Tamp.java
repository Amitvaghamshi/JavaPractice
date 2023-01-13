package threadpool;

import java.util.Arrays;

public class Tamp {

	public static void main(String[] args) {
		
		String str="13,5,6,7,8";
		
		String[] arr=str.split(","); 
		int n=Integer.parseInt(arr[0])+1;
		System.out.println(Arrays.toString(arr));
		
	}
}
