package com.masai.collection;

import java.util.Comparator;

public class Desc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		  if(o1.getName().compareTo(o2.getName())>1) {
			  return -1;
		  }else {
			  return 1;
		  }
	}

}
