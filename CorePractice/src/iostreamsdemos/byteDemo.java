package iostreamsdemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class byteDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		File f=new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\bg.jpg");
//		
//		System.out.println(f.exists());
//		
//		FileInputStream fis=new FileInputStream(f);
//		
//		ObjectInputStream oos=new ObjectInputStream(fis);
//		
//		oos.readObject();
		
		Student s=new Student();
		s.name="amit";
		s.addr="sd";
		s.marks=456;
		
		File f=new File("abc.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student st=(Student)ois.readObject();
		System.out.println(st);
		
		
		try {
			
		}catch (ArithmeticException | NullPointerException  e) {
			// TODO: handle exception
		}
	}
}
