package com.masai.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqgen")
	@SequenceGenerator(sequenceName = "seqgen" ,name = "myseq" ,allocationSize = 1,initialValue = 1)
	private Integer id;
	private String name;
	@Email
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate joindate;
	@JsonFormat(pattern = "HH/mm/ss")
	private LocalTime officetime;
//	@JsonFormat(pattern =  "dd/MM/yyyy HH:mm:ss")
//	private LocalDateTime dubadu;
	private String password;
	@Enumerated(EnumType.STRING)
	private Gendar gendar;
	
	@Embedded
	@ElementCollection
	@JoinColumn(name = "EmpId")
	private List<Address> addresses;
	
	@ManyToOne
	@JoinColumn(name = "DeptID")
	@JsonIgnore
	private Department dept;

}
