package com.masai.exc;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Amit a=new Amit();
		
		try {
			a.get();
		} catch (MyError e) {
			e.printStackTrace();
		}
	}

}
