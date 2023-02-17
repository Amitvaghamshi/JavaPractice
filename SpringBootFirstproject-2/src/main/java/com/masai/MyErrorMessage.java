package com.masai;

import java.time.LocalDateTime;

public class MyErrorMessage {

	  private final LocalDateTime time=LocalDateTime.now();
	  private String msg;
	  private String details; 
	  
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDateTime getTime() {
		return time;
	}
	@Override
	public String toString() {
		return "MyErrorMessage [time=" + time + ", msg=" + msg + ", details=" + details + "]";
	}
	  
	  
}
