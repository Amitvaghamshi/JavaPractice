package com.masai.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDto {

	private String name;
	private String gender;
	private List<Address> addr;
	
	
	public EmployeeDto(String name, String gender, List<Address> addr) {
		
		this.name = name;
		this.gender = gender;
		this.addr = addr;
	}
	
	
	
	
}
