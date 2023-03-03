package com.masai;
import static java.lang.System.out;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.sqrt;

public class Demo {
	
	public static void main(String[] args) {
		
		
//		sqrt(13);
//		
//		B b=new B();
//		out.println(b);
//		b.b1();
//		
//		A a=new B();
//		a.a1();
//		a.o();
//		
//		B a2=(B)a;
//		
//		a2.o();
//		
//		
//		Enum[] e=en.values();
//		
//		en am=en.valueOf("AMI");
//		System.out.println(am);
//		
//		for(Enum x:e) {
//			System.out.println(x.name()+"ordinal :"+x.ordinal());
//		}
		
		
		
		Pattern p=Pattern.compile("ab");
		
		Matcher m=p.matcher("abgieabbfreabb");
		
		while(m.find()) {
			System.out.println(m.start()+" "+(m.end()-1)+" "+m.group());
		}
		
		Pattern pe=Pattern.compile("^[a-z]+@[a-zA-Z_0-9.]*");
		Matcher me=pe.matcher("amitva@gmail.com");
		
		System.out.println(me.matches());
		
		try {
			
		} catch ( ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			
		}
		
	}

}
