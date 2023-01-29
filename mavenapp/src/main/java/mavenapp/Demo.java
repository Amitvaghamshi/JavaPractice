package mavenapp;

import java.sql.Connection;



import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	
	public static String opps;
	static int  x;

	public static void main(String[] args) {
		
		x=5;
		System.out.println(x);
		
		System.out.println(opps);
		int iu;
		iu=0;
		System.out.println(iu);
		
		String str=new String("ddfjd");
		
		Object obj= str.getClass();
		System.out.println(obj);
		System.out.println(str.hashCode());
		
		System.out.println(obj);
		
		
		///char[] arr=str.split(" ");
		
		int[][] arrr= {
				{2,3,4,5,6,7,7},
				{2,3,4,5}
				};
		int[][] xes=new int[3][3];
		for(int[] a:arrr) {
			for(int c:a) {
				System.out.println(c);
			}
		}
		
		byte b=(byte)1223545;
		System.out.println(b);
		double x=3.43;
		float s=(float)(22/7.0);
		System.out.println(s);
		int Aa='l';
		
		Demo[] d=new Demo[3];
		d[0]=new Demo();
		
		int xyz=b+4;
		
		//int  n=2.3;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/first_database";
	    try {
			Connection conn= DriverManager.getConnection(url,"root","5645");
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
