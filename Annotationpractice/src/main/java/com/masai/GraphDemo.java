package com.masai;

import java.util.ArrayList;

public class GraphDemo {
	
	
	public static void gc(ArrayList<Edge>[] graphs) {
		    for(int i=0;i<graphs.length;i++) {
		    	graphs[i]=(new ArrayList<Edge>());
		    }
		    
		    graphs[1].add(new Edge(1, 2));
		    
		    graphs[2].add(new Edge(2, 3));
		    graphs[2].add(new Edge(2, 4));
		    
		    graphs[3].add(new Edge(3, 2));
		    graphs[3].add(new Edge(3, 4));
		    
		    graphs[4].add(new Edge(4, 3));
		    graphs[4].add(new Edge(4, 2));
		    
	}

	    public static void main(String[] args) {
			
	    	ArrayList<Edge>[] graphs=new ArrayList[5];
	    	gc(graphs);
	    	for(int i=0;i<graphs.length;i++) {
	    		System.out.println(graphs[i]);
	    	}
		}
}
