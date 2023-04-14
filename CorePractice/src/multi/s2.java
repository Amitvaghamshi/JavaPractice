package multi;

public class s2 extends s1{
 
	int x;
    s2(int y){
    	super(y+100);
    	this.x=y;
    }
    
    @Override
    public int getx() {
    	System.out.println("child");
    	return x;
    }
    
    public static void main(String[] args) {
		 s2 s=new s2(34);
		 System.out.println(s.getx());
		 
	}
}
