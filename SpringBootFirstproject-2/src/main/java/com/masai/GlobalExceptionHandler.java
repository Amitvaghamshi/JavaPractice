package com.masai;

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
	  public ResponseEntity<MyErrorMessage> Exp(IllegalArgumentException ir,WebRequest rq){
		    
		
		MyErrorMessage me=new MyErrorMessage();
		me.setMsg(ir.getMessage());
		me.setDetails(rq.getDescription(false));
		
		  return new ResponseEntity<>(me,HttpStatus.NOT_FOUND);
	  }
	
	@ExceptionHandler(Exception.class)
	  public ResponseEntity<MyErrorMessage> Allexp(Exception ex,WebRequest wr) {
		
		MyErrorMessage erm=new MyErrorMessage();
		erm.setMsg(ex.getMessage());
		erm.setDetails(wr.getDescription(false));
		
		  return new ResponseEntity<>(erm,HttpStatus.BAD_REQUEST);
	  }
	
	 @ExceptionHandler(NoHandlerFoundException.class)
	   public ResponseEntity<MyErrorMessage> invalidHandle(NoHandlerFoundException ex,WebRequest wr) {
		MyErrorMessage erm=new MyErrorMessage();
		erm.setMsg(ex.getMessage());
		erm.setDetails(wr.getDescription(false));
		
		return new ResponseEntity<>(erm,HttpStatus.BAD_REQUEST);
	 }
	 
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	 public ResponseEntity<MyErrorMessage> invalidmehodArg(MethodArgumentNotValidException ex,WebRequest wr) {
		 
		 MyErrorMessage er=new MyErrorMessage();
		 er.setMsg(ex.getBindingResult().getFieldError().getDefaultMessage());
		 er.setDetails(wr.getDescription(false));
		 
		 return new ResponseEntity<MyErrorMessage>(er,HttpStatus.BAD_REQUEST);
	 }
	
}
