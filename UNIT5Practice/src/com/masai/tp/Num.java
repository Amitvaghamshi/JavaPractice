package com.masai.tp;

public class Num {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1;i<=601;i++){
			String str=""+i;
			for(int j=0;j<str.length();j++) {
//				if(str.charAt(j)=='0') {
//					count++;
//				}
				
				count++;
			}
		}
		
    System.out.println(count);	
	
	}
}
