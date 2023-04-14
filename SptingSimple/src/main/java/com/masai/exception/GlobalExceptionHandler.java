package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	   @ExceptionHandler(IllegalArgumentException.class)
	   public ResponseEntity<MyErrorDetails> notvalid(IllegalArgumentException ex ,WebRequest wr){
		   
		   MyErrorDetails er=new MyErrorDetails();
		   er.setDetails(wr.getDescription(false));
		   er.setMessage(ex.getMessage());
		   
		   return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
	   }
	   
	   
	   @ExceptionHandler(NoHandlerFoundException.class)
	   public ResponseEntity<MyErrorDetails> notvalidArgs(NoHandlerFoundException ex ,WebRequest wr){
		   
		   MyErrorDetails er=new MyErrorDetails();
		   er.setDetails(wr.getDescription(false));
		   er.setMessage(ex.getMessage());
		   
		   return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
	   }
	   
	   @ExceptionHandler(StudentException.class)
	   public ResponseEntity<MyErrorDetails> StudentNotFound(StudentException ex,WebRequest wr) {
		   MyErrorDetails er=new MyErrorDetails();
		   er.setDetails(wr.getDescription(false));
		   er.setMessage(ex.getMessage());
		   
		   return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
		   
	   }
	   
	   
	   @ExceptionHandler(MethodArgumentNotValidException.class)
	   public ResponseEntity<MyErrorDetails> HandlerNotFound(MethodArgumentNotValidException ex,WebRequest wr) {
		   MyErrorDetails er=new MyErrorDetails();
		   er.setDetails(wr.getDescription(false));
		   er.setMessage(ex.getBindingResult().getFieldError().getDefaultMessage());
		   
		   return new ResponseEntity<MyErrorDetails>(er,HttpStatus.BAD_REQUEST);
		   
	   }
	   
	   
	   
	   
	   
}

