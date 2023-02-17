package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	
	
	public static  void gc( List<Edge> graphs[]) {
		   for(int i=0;i<graphs.length;i++) {
			   graphs[i]=new ArrayList<Edge>();
		   }
		   
		   graphs[1].add(new Edge(1,2));
		   graphs[1].add(new Edge(1,3));
		   
		   graphs[2].add(new Edge(2,1));
		   graphs[2].add(new Edge(2,3));
		   graphs[2].add(new Edge(2,4));
		   
		   graphs[3].add(new Edge(3,1));
		   graphs[3].add(new Edge(3,2));
		   graphs[3].add(new Edge(3,7));
		   
		   graphs[4].add(new Edge(4,2));
		   graphs[4].add(new Edge(4,5));
		   graphs[4].add(new Edge(4,6));
		   
		   graphs[5].add(new Edge(5,3));
		   graphs[5].add(new Edge(5,4));
		   
		   graphs[6].add(new Edge(6,4));
		   graphs[6].add(new Edge(6,7));

		   graphs[7].add(new Edge(7,6));
		   graphs[7].add(new Edge(7,3));
	}
	
	
	public static void BFS(List<Edge> graphs[],int v) {
		    
		  boolean[] visited=new boolean[v];
		  
		  Queue<Integer> q=new LinkedList<>();
		  
		  q.add(1);
		  
		  while(!q.isEmpty()) {
			     
			   int curr=q.poll();
			   if(visited[curr]==false) {
				    System.out.println(curr);
				    visited[curr]=true;
				    
				    for(int i=0;i<graphs[curr].size();i++) {
				    	   q.add(graphs[curr].get(i).des);
				    }
				    
				    
			   }
		  }
	}
	
	
	public static boolean[] vis=new boolean[50];
	public static  void DFS(List<Edge> graphs[],int curr) {
		    
		   if(vis[curr]==true) {
			   return;
		   }
		   
		   System.out.println(curr);
		   vis[curr]=true;
		   
		   for(int i=0;i<graphs[curr].size();i++){
			       DFS(graphs,graphs[curr].get(i).des);
		   }
	}
	

	   public static void main(String[] args) {
		
		   int v=70;
		   List<Edge> graphs[]=new ArrayList[v];
		   
		   gc(graphs);    // for generating graph
		   
		   BFS(graphs,v);   // for bfs
		   
		   DFS(graphs,1);
		   
	}
}

class Edge{
	int source;
	int des;
	
	public Edge(int source, int des) {
		super();
		this.source = source;
		this.des = des;
	}
	
	
}
