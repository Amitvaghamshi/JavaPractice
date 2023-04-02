package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Department {

	  @Id
	  private Integer did;
	  private String dame;
	  private String location;
	  
	  @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "dept")
	  @JsonProperty(access = Access.READ_ONLY)
	  List<Employee> employees=new ArrayList<>();
}
