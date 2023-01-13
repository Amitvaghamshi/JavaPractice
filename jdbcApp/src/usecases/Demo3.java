package usecases;

import java.util.Scanner;

import dao.StudentDao;
import dao.StudentdaoImpl;

public class Demo3 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		
		       StudentDao st =new StudentdaoImpl();
		       int x=st.getMarkByRoll(roll);
		       
		       if(x>0) {
		    	   System.out.println("mark is "+x);
		       }else {
		    	   System.out.println("mark not found");
		       }
	}
}
