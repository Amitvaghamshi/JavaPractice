package com.masai.exc;

public class Amit implements ExTry{

	@Override
	public void get() throws MyError{
		
		int x=0;
		if(x<0) {
			throw new MyError("Demo errror");
		}
		
	}

	 
}
