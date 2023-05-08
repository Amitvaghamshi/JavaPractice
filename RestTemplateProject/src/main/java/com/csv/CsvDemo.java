package com.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributeValueException;


public class CsvDemo {

	public static void main(String[] args) throws IOException, InvalidAttributeValueException {
		
		
		File f=new File("CsvDemo.csv");
//		try {
//			f.createNewFile();
//			System.out.println("created");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		Scanner sc=new Scanner(f);
//		
//		sc.useDelimiter(",");
//		
//		while(sc.hasNext()){
//			System.out.println(sc.next());
//		}
//		
//		Path p=Path.of("CsvDemo.csv");
//		List<String> lis= Files.readAllLines(p);
//		
//		System.out.println(lis);
		
//		BufferedReader br=new BufferedReader(new FileReader(f));
//		String line="";
//		while((line=br.readLine())!=null) {
//			   String[] arr=line.split(",");
//			   for(String x:arr) {
//				   System.out.print(x+" ");
//				   
//			   }
//			   System.out.println();
//		}
		
	 	int x= giveval(1,1);
	 	System.out.println(x);
		
	}
	
	
	static int  giveval(int row,int col) throws IOException, InvalidAttributeValueException {
		
		   Path f=Path.of("CsvDemo.csv");
		   List<String> ans=Files.readAllLines(f);
		   
		   int actualRow=ans.size();
		   int actualCol=ans.get(0).split(",").length;
		   
		   if(row<0 || row>actualRow || col<0 || col>actualCol) {
			   throw new InvalidAttributeValueException("Not int a range");
		   }
		   
		   System.out.println(actualRow);
		   System.out.println(actualCol);
		  
		   System.out.println("----------------");
		   
		   String charAns=ans.get(actualRow-1).split(",")[col-1];
		  
		
		  return Integer.parseInt(charAns);
	}
	
	public static void csvreaderDemo() {
		   
	}
}
