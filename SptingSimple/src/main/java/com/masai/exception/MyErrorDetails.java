package com.masai.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {

	private final LocalDateTime timeStamp=LocalDateTime.now();
	private String message;
	private String Details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	
	
	
	
}
