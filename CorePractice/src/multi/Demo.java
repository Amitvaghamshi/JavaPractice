package multi;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.Math.*;
public class Demo implements A,B{

	@Override
	public void hello() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
		  
		for(String x:args) {
			System.out.println(x);
		}
		
//		int x=435650967;
//		
//		System.out.println(2>1 ?"yes":"No");
//		
//		A:for(int i=0;i<23;i++) {
//			 for(int j=0;j<10;j++) {
//				 if(j==3) {
//					 break A;
//				 }
//				 System.out.println(j);
//			 }
//		}
		
		
		
		LocalDateTime t1=LocalDateTime.now();
		
		LocalDateTime t2=LocalDateTime.now();
		
		
		
	    Duration d=Duration.between(t1, t2);
	    System.out.println(d.toNanos());
		
		
		int[] arr=new int[10];
		
		int[][] ar= {{13,5},{3,5,6,7},{3,6},{5,6}};
		
		int[][] tf=new int[2][];
		tf[1]=new int[10];
		
		
		Map<Integer,Integer>[] ae=new Map[10];
		System.out.println(ae[0]);
		
		s1 s=new s1(23);
		System.out.println(s.hashCode());
	
		
		System.out.println("-----------");
		
		s1 x=new s1(1, "amit");
		s1 y=new s1(1, "amit");
		System.out.println(x.equals(y));
		
		
		// static import
		out.println("dfg");
		max(1, 3);
		sqrt(4);
		
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		Ed ew=Ed.SMALL;
		
		
		ew.ordinal();
		
		Ed e=Ed.valueOf(str.toUpperCase());
		
			System.out.println(e.toString());
		
	}
	

}
