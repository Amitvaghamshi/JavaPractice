package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreamsDemo {
	
	public static int count=0;
	public static void findfile(File f) {
		count++;
		     File[] x=f.listFiles();
		     
		     for(File d:x) {
		    	   if(d.isDirectory()) {
		    		   findfile(d);
		    	   }else {
		    		   System.out.println(d);
		    	   }
		     }
	}

	  public static void main(String[] args) throws IOException {
		
		  File f=new File("amit.txt");
		
		  System.out.println(f.isFile());
//		  File[] arr=f.listFiles();
//		  for(File c:arr) {
//			  System.out.println(c);
//		  }
		  
		  //findfile(f);
		  //System.out.println(count);
		  
		  
		  
		 
		  
//		  try {
//			boolean c= f.createNewFile();
//			System.out.println(c);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		  
		  
		  
		  try {
				FileWriter fr=new FileWriter(f);
				fr.write("hii pappu \n bolo");
				fr.flush();
				fr.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		  
		  
		try {
			FileReader frd = new FileReader(f);
			//frd.close();
			 try {
				
				 char[] ch=new char[100];
				 
				int x=frd.read(ch);
				System.out.println(x);
				
				for(char xs:ch) {
					System.out.println(xs);
				}
				
				while(x!=-1) {
					  System.out.println((char)x);
					  x=frd.read();
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
