package More;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX {

	public static void main(String[] args) {
		
		  Pattern p=Pattern.compile("sb");
		  
		  Matcher m=p.matcher("asbgeysbr29@8sb46s");
		  System.out.println(m.matches());
		  
		  
		  while(m.find()) {
			   System.out.println(m.start()  +" "+m.end()  +"   "+m.group() );
		  }
		  
		  
		  
		  // whatvee i write //]ealways consider as single time
		  //so we need perform in a better way
		  // this is the concept of regx3
	}
	
}
