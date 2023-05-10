package More;

import java.util.ArrayList;
import java.util.List;

public class GenRix<T extends Number>{
	
	
	public List<T> sort(T lis){
		   return null;
	}

	public static void main(String[] args) {
		X<Integer> x=new X();
		x.hello(1);
		
		GenRix gx=new GenRix();
		//gx.sort(Arrays.asList(1.4,(byte)3,(short)4,5l,5.7 ,"jj"));
		List<Integer> lis=new ArrayList<>(); 	  
	}
}



class X<T>{
	public void hello(T x) {
		System.out.println(x);
	}
}