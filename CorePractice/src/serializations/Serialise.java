package serializations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Serialise {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Student s=new Student();
		s.name="amit";
		s.roll=43;
		s.addr="Amreli";
		
		
//		FileOutputStream fos=new FileOutputStream("amit.txt");
//		
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		
//        oos.writeObject(s);
//        oos.flush();
//        oos.close();
//       
//        FileInputStream fis=new FileInputStream("amit.txt");
//        ObjectInputStream ois=new ObjectInputStream(fis);
//        Student sts= (Student)ois.readObject();
//        System.out.println(sts);
        
        
        Path p=Paths.get("amit.txt");
        
        Stream<String> ff=Files.lines(p);
        
      //  Files.write(p, "hiiii".getBytes(), StandardOpenOption.APPEND);
        
//        System.out.println(ff);
        
        ff.forEach(a->System.out.println(a));
        
	}
}
