package threading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesPractice {
	
	
	public static int count=0;
	
	public static void find(File f) {
		count++;
		   if(f.isDirectory()){
			    File[] d= f.listFiles();
			    for(int i=0;i<d.length;i++){
			    	  find(d[i]);
			    }
		   }else {
			   System.out.println(f.getName());
		   }
	}

	public static void main(String[] args) throws IOException {
		

//		File f=new File("E:\\MASAI");
//		find(f);
		
		File f=new File("amit.txt");
		FileWriter fr=new FileWriter(f);
		fr.write("Helllo world ");
		fr.write("\n");
		fr.write("hii Amit");
		fr.write(100);
		fr.flush();
		
		
		FileReader frr=new FileReader(f);
	
		int x=frr.read();
		while(x!=-1) {
			System.out.print((char)x);
			x=frr.read();
		}
		frr.close();
		
		FileReader fa=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fa.read(ch);
		fa.close();
		for(char g:ch) {
			System.out.print(g);
		}
		
		
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write("Pappu 2");
		bw.newLine();
		bw.write("New World");
		bw.flush();
		
//		
//		BufferedReader fbr=new BufferedReader(fa);
//		System.out.println(fbr.readLine());
//		fbr.lines().forEach(e->System.out.println(e));
//		fbr.close();
//		
		
		
		//System.out.println((char)frr.read());
		
		
		
	PrintWriter pw=new PrintWriter(fr);
	pw.print("Dnjefef");
	pw.println(43444);
	pw.flush();
	
	}
}
