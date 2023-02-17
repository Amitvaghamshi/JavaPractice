package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		 List<Integer> li= new ArrayList<>();
		 li.add(23);
		 li.add(453);
		 li.add(265);
		 li.add(5433);
		 li.add(2456);
		 li.add(5433);
		 
		Stream ps= li.stream().filter(s->s>=500);
		System.out.println(ps);
		
		
		int  x= li.stream().min((a,b)->a>b?1:-1).get();
		System.out.println(x);
		
		
		Set<Integer> cd= li.stream().filter(s->s>400).collect(Collectors.toSet());
		System.out.println(cd);
		
		
		List<Integer> lic= li.stream().map(s->s+500).collect(Collectors.toList());
		System.out.println(lic);
		
		
		List<Student> st=new ArrayList<>();
		
		st.add(new Student("amit", 345, "dfgtre"));
		st.add(new Student("ashish", 644, "dfgtre"));
		st.add(new Student("tamburo", 254, "dfgtre"));
		st.add(new Student("kelo", 554, "dfgtre"));
		
		
	   Optional<Student> opn= st.stream().filter(s->s.getMarks()>=0).min((j,k)->j.getMarks()>k.getMarks()?1:-1);
		
		
		
		System.out.println(opn.get());
	}
}
