package com.masai.service;

import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Service;

import com.masai.model.LoginDto;

@Service
public interface LoginService {
	
	
	public String LoginToAcc(LoginDto dto) throws LoginException;
	public String Logout(String key) throws LoginException;

}
