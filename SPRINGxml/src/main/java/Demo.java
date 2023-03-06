
public class Demo {

	public static void main(String[] args) {
		
		
		int[] arr= {90,8};
		
		
		String str="";
		
		for(int i=0;i<arr.length;i++) {
			  str+=arr[i];
		}
		System.out.println(str);
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length-1;i++) {
			   for(int j=0;j<ch.length-1-i;j++) {
				    if(ch[j]<ch[j+1]) {
				       char	tamp=ch[j];
				       ch[j]=ch[j+1];
				       ch[j+1]=tamp;
				    }
			   }
		}
		
		
		System.out.println(ch);
		
	}
}
