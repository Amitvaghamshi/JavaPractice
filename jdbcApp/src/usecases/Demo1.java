package usecases;

import java.util.Scanner;
import dao.StudentdaoImpl;
import exception.StudentNotFoundException;

public class Demo1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter address");
		String add=sc.next();
		
		System.out.println("Enter numbar");
		String num=sc.next();
	
		
		
		
		StudentdaoImpl st=new StudentdaoImpl();
		
		try {
			String x;
			x = st.insertStudentDetais(roll, name, add, num);
			System.out.println(x);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
