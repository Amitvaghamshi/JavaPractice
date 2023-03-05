package com.masai.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Demo {
	
	
	public static void find(File f) {
		 
		
		  if(f.isDirectory()) {
			  
			  System.out.println(f.getName());
			  
			  File[] lis=f.listFiles();
			  
			  for(File x:lis) {
				  find(x);
			  }
			  
			  
		  }else {
			  System.out.println(f.getName());
		  }
		
	}
	

	public static void main(String[] args) throws IOException {
		
		File f=new File("amit.txt");
		
		FileReader fr=new FileReader(f);
		
		FileWriter fw=new FileWriter(f);
		
		fw.write("abcd \n");
		fw.write("xyz");
		
		Character[] ch=new Character[20];
		
		fw.flush();
		fw.close();
		
	}
}
