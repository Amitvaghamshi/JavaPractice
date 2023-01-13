package Filepracice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FIleDemo {
	
	public static void getfile(File f) {
		      
		
		File[] li=f.listFiles();
		
		for(File file:li) {
			
			if(file.isDirectory()) {
				System.out.println(file.getName());
				   getfile(file);
			}else {
				System.out.println(file.getName());
			}
			
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		
		
		File f=new File("D:\\amit");
		
		Student s1=new Student("amit", 1, 234);
		Student s2=new Student("ashish", 2, 2334);
		Student s3=new Student("tapu", 3, 2334);
		
		//FileOutputStream fs=new FileOutputStream(f);
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(f));
		
		List<Student> st=new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		
		os.writeObject(st);
		
		
		os.flush();
		os.close();
		
		System.out.println("adding done");
		
		
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream(f));
		List<Student> get=(List<Student>) oi.readObject();
		
		for(Student s:get) {
			System.out.println(s.name);
		}
		
		System.out.println("gwtting done");
		
		oi.close();
		
		
	}	
	
}
