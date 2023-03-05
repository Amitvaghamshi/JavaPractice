package com.masai.tp;

public class Tb implements Runnable{
	@Override
	public void run() {
		for(int i=11;i<20;i++) {
			System.out.println(i);
		}
	}
}
