package com.masai;
import static java.lang.System.out;
import static java.lang.Math.sqrt;

public class Demo {
	
	public static void main(String[] args) {
		
		
		sqrt(13);
		
		B b=new B();
		out.println(b);
		b.b1();
		
		A a=new B();
		a.a1();
		a.o();
		
		B a2=(B)a;
		
		a2.o();
		
		
		Enum[] e=en.values();
		
		en am=en.valueOf("AMI");
		System.out.println(am);
		
//		for(Enum x:e) {
//			System.out.println(x.name()+"ordinal :"+x.ordinal());
//		}
		
		
	}

}
