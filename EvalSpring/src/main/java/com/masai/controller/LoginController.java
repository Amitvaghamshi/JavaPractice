package com.masai.controller;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.LoginDto;
import com.masai.service.LoginService;
import com.masai.service.LoginServiceImpl;

@RestController
public class LoginController {
	
	@Autowired
	private LoginServiceImpl logs;

	 @PostMapping("/login")
	 public ResponseEntity<String> logintoAcc(@RequestBody LoginDto dto) throws LoginException{
		String str=  logs.LoginToAcc(dto);
		return new ResponseEntity<String>(str,HttpStatus.OK);
		  
	 }
}
