package serializations;

public class MyAto {

	public static int myAtoi(String s) {
        boolean nagative=false;

        String str="";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='-'){
                nagative=true;
                continue;
            }
            if(s.charAt(i)>=49 && s.charAt(i)<=57){
            	str+=s.charAt(i);
            }else {
            	continue;
            }
              
        }

        if(nagative){
            return -Integer.parseInt(str);
        }else{
            return Integer.parseInt(str);
            
        }
        

   }
	
	public static void main(String[] args) {
		
		int x=myAtoi("  -42  hii a");
		System.out.println(x);
		
	}
}
