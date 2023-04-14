package multi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {

	public static void main(String[] args) {
		
		   
		    Pattern p=Pattern.compile("^[0-9]4$");
		    //  (".*[A-Z]+")
		    
		    Matcher m=p.matcher("24");
		    
		    System.out.println(m.matches());
		    
		    
		    
		    try {
		    	
		    	
		    	try {
		    		int[] arr= {1,4,5,6};
		    		System.out.println(arr[1]/0);
					
				} catch (Exception e) {
					System.out.println("Inside nt");
				}
		    	
		    	
		    }catch (ArrayIndexOutOfBoundsException e) {
		    	System.out.println(e.getMessage());
			}
		    
		System.out.println("hello");
		
		
		
		
		
	}
}
