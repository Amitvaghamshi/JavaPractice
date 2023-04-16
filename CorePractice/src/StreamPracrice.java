import java.util.ArrayList;
import java.util.List;

public class StreamPracrice {

	public static void main(String[] args) {
		
		List<Integer> lis=new ArrayList<>();
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		
		lis.stream().map(a->a+"").filter(a->a.length()>5);
		

		Thread t=new Thread();
		t.start();
		
	}
}
