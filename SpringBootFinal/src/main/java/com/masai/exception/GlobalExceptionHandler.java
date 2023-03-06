package com.masai.exception;

import org.springframework.boot.web.server.WebServer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exc(Exception ex ,WebRequest wr){
		
		MyErrorDetails er=new MyErrorDetails(ex.getMessage(), wr.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(er,HttpStatus.OK);
	}
	
}
