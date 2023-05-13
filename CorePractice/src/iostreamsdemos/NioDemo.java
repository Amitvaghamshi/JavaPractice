package iostreamsdemos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NioDemo {
	
	public static void main(String[] args) throws IOException {
		
		 Path p=Path.of("amit.txt");
		 
		 byte[] lis= Files.readAllBytes(p);
		 for(byte b:lis) {
			 System.out.print((char)b);
		 }
		
		
	}

}
