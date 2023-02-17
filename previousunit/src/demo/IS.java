package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class IS {

	
	public static void main(String[] args) throws IOException {
		
 
		File f=new File("amit.txt");
		FileWriter fw=new FileWriter(f,true);
		PrintWriter pw=new PrintWriter(fw);
		
	//	pw.write((int)3456);
		pw.print(555);
		pw.flush();
		
		pw.close();
		
		
		FileReader fr=new FileReader(f);
	}
}
