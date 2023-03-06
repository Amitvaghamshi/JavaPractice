package com.masai.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyErrorDetails {
	
	
	private String message;
	private final LocalDateTime timeStamp =LocalDateTime.now();
	private String details;

}
