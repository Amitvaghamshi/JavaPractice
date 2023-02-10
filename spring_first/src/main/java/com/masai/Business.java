package com.masai;

import java.util.List;

public class Business {
	
	int id;
	Employee e;
	List<Integer> li;
	
	
	
      public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Employee getE() {
		return e;
	}



	public void setE(Employee e) {
		this.e = e;
	}



	public List<Integer> getLi() {
		return li;
	}



	public void setLi(List<Integer> li) {
		this.li = li;
	}



	public void fun() {
    	  System.out.println("Hey");
      }
}
