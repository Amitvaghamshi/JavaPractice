package jdbcproject;

public class Stb {

	static {
		System.out.println("Inside static  block");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args) {
		   System.out.println("inside main");
		   
		   Stb s=new Stb();
	}
}

