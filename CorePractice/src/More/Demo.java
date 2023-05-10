package More;

import java.util.TreeSet;

public class Demo  {

	
	int x;
	
	Demo(int x){
		this.x=x;
	}
	public static void main(String[] args) {
		
		
		//int i=10;
		long l=100;

		int i=(int)l;
		
	}
}


class Ad extends Demo{
	Ad(){
		super(10);
	}
	
	public static void main(String[] args) {
//		List<Integer> lis=new ArrayList<>();
//		Iterator<Integer> itr=lis.iterator();
//		lis.toArray();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		TreeSet<Integer> set=new TreeSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println(set.subSet(3,4));
		
	}
}