package com.masai.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CsvFilesDemo {

	/**
	 * 
	 * @param args pass no of row
	 * @throws CsvValidationException
	 * @throws IOException
	 */
	public static void main(String[] args) throws CsvValidationException, IOException {
		
		File file=new File("CsvDemo.csv");
		
		CSVReader cs=new CSVReader(new FileReader(file));
		CSVWriter csw=new CSVWriter(new FileWriter(file,true));
		
		String[] str= {"24","54","64","54","35","21","33","10"};
		int[] inarr= {1,2,4,5,6,7,7,4};
		csw.writeNext(str);
		csw.flush(); 
		//cs.close();
		String[] arr=null;
	   	while((arr=cs.readNext() )!=null){
	   		    for(String s:arr) {
	   		    	System.out.print(s+" ");
	   		    }
	   		    System.out.println();
	   	}
	}
}
