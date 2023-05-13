package iostreamsdemos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		 
		   File f=new File("abc.txt");
		   try {
				  f.createNewFile();
				} catch (Exception e) {
				  e.printStackTrace();
		   }
		   
		   FileReader fr=new FileReader(f);
		   
		   int ch=fr.read();
		   while(ch!=-1) {
			    // System.out.print((char)ch);
			     ch=fr.read();
		   }
		   System.out.println((char)fr.read());
		   
		   
		   FileWriter fw=new FileWriter(f,true);
		   fw.write("dfqxni\nzefeffefxedw\nzeeaxexfq");
		   fw.flush();
		   
		   BufferedWriter bw=new  BufferedWriter(fw);
		   bw.write(1234);
		   bw.newLine();
		   bw.flush();
		   
		   BufferedReader br=new BufferedReader(fr);
		//   br.lines().forEach(System.out::println);
		   
		   String line=br.readLine();
		   while(line!=null) {
			     System.out.println(line);
			     line=br.readLine();
		   }
		  
		// 
		   
		   PrintWriter pw=new  PrintWriter(f);
		   pw.append("uefgywefygwefug");
		   pw.println();
		   pw.print(123);
		   pw.println("suyedyefdtff");
		   pw.println(false);
		   pw.flush();
		   
		   
		  
	}
}
