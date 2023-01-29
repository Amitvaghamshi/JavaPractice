package mavenapp;

public class practice {

	public enum names{
		AMIT,ASHISH,ROHIT;
	};
	
	public static void main(String[] args) {
		names[] str=names.values();
		for(names x:str) {
			System.out.println(x);
		}
		
		try {
			names sd=names.valueOf("ROHT");
			System.out.println(sd);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
