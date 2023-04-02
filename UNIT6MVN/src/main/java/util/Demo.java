package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import jakarta.persistence.criteria.CriteriaBuilder.In;


public class Demo {

	 
	  
	  public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, IOException, ClassNotFoundException{
	 	

		  
//		Constructor[] cons= Student.class.getDeclaredConstructors();
//		cons[0].setAccessible(true);
//		Student s1=(Student)cons[0].newInstance();
//		
//		
//		Constructor[] cons2= Student.class.getDeclaredConstructors();
//		cons[0].setAccessible(true);
//		Student s2=(Student)cons[0].newInstance();
		
		
	//	Student s2= (Student)Student.class.getDeclaredConstructors()[0].newInstance();
		
	//	System.out.println(s1==s2);
		
		
//		Object j=new Object();
//		Object d=new Object();
//		
//		System.out.println(j==d);
		  
		  
		
		  
		  File f=new  File("amit.txt");
	//	  f.createNewFile();
		  
		  FileOutputStream fo=new FileOutputStream(f);
		  ObjectOutputStream oo=new ObjectOutputStream(fo);
		  Student s1=Student.getStudent();
		  oo.writeObject(s1);
		  
		  FileInputStream fs=new FileInputStream(f);
		  ObjectInputStream oos=new ObjectInputStream(fs);
		  Student s2=(Student)oos.readObject();
		  
		  System.out.println(s1==s2);
		  
		  
		  

			Set<Integer> lis=new HashSet<>();
			
			
			String[] arr= {"z","w","er","r"} ;
			String s= String.join("", arr);
			String[] str= s.split("");
			
			Integer[] itr= {2,3,4,5,6,7,};
			
			
			
			System.out.println(Arrays.toString(str));
			//System.out.println(s);
			
			Queue<Integer> q=new PriorityQueue<>();
			q.add(2);
			q.add(3);
			
			
			Integer mx= Collections.max(q);
			System.out.println(mx);
			
	 }

	
}
