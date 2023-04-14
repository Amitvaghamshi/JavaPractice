package com.masai;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {

	@Value("SOS")
	public String name;
	@Value("1")
	public int id;
	

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public School(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
	public School() {
		
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", id=" + id + "]";
	}
	
	
	

}
