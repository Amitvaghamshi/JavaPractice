package com.masai;

public class Edge {
       int source ;
       int des;
       
	public Edge(int source, int des) {
		super();
		this.source = source;
		this.des = des;
	}

	@Override
	public String toString() {
		return "Edge [source=" + source + ", des=" + des + "]";
	}
       
       
}
