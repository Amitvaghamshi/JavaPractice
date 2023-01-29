package s1p;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExx {

	public static void main(String[] args) {
		
		
		
		int[] arr= {2,3,4,5,6,7,8};
		
		List<Integer> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		
		
		try {
			System.out.println("enter  n");
			int n=sc.nextInt();
			
			System.out.println(arr[n]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
		    System.out.println(e.getMessage());
		 //   RegularExx.main();
		
		}
//		Pattern p=Pattern.compile("[A-Za-z\\s]+");
//		Matcher m=p.matcher("Amit vagh");
//		System.out.println(m.matches());

		sc.close();
		
		
		
	}
	}
