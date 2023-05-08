package serializations;

public class ReverseNumber {

	 public static int reverse(int x) {

	        boolean flag=true;
	         if(x<0){
	             x=-x;
	             flag=false;
	         }
	        
	        long k=0;
	        while(x>0){   
	           	k=k*10+(x%10);
	            x=x/10;
	        }

	        if(k>Integer.MAX_VALUE || k<Integer.MIN_VALUE){
	            return 0;
	        }

	       if(flag==true){
	           return (int)k;
	       }else{
	           return -(int)k;
	       }
	    }
	 
	
	 
	 public static void main(String[] args) {
		     int x=1534236469;
		   //  System.out.println(reverse(x));
		     
		     char ch='1';
		     System.out.println(ch>9-'0');
	}
}
