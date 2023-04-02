package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler(EmployeeException.class)
	  public ResponseEntity<MyErrorDetails> employeeNotFoundEx(EmployeeException ex,WebRequest wr){
		 
		    MyErrorDetails mr=new MyErrorDetails();
		    mr.setDetails(wr.getDescription(false));
		    mr.setMessage(ex.getMessage());
		    
		    return new ResponseEntity<MyErrorDetails>(mr,HttpStatus.BAD_REQUEST);
		 
	  }
}
