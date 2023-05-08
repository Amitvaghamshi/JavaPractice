package Algo;

import java.util.Optional;

class x{
	int a;
	double b;
}

class y extends x{
	int c;
}

public class A {

	public static void main(String[] args) {
//		  x a=new x();
//		  y b=new y();
//		  
//		 Class obj=b.getClass();
//		 System.out.println(obj.getSuperclass());
		
		Optional<Integer> op=Optional.empty();
		
		op.isPresent();
	}
}
