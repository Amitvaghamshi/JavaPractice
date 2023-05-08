package allpractice;

import java.util.Objects;

public class Wrappe {
	
	int x;
	int y;
	
	public static void main(String[] args) {
		
		Integer a=new Integer(1);
		Integer b=new Integer(1);
		
		System.out.println(a==b);
		
		
	    String str="eifhe";
	  
		System.out.println(str.concat("hii"));
	}

	@Override
	public int hashCode() {
		return Objects.hash(x,y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wrappe other = (Wrappe) obj;
		return x == other.x && y == other.y;
	}
	
	

}


 class he{
	
}
