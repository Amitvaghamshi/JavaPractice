package com.masai.service;

import java.util.Optional;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Employee;
import com.masai.model.LoginDto;
import com.masai.model.UserSession;
import com.masai.repository.EmployeeRepository;
import com.masai.repository.SessionRepository;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private EmployeeRepository emprepo;
	
	@Autowired
	private SessionRepository sessionrepo;

	
	private String RandGeneratedStr(int l){

		// a list of characters to choose from in form of a string
		 String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";

		 // creating a StringBuffer size of AlphaNumericStr
		 StringBuilder s = new StringBuilder(l);
		 
		 
		 int i;

		 for ( i=0; i<l; i++) {

		   //generating a random number using math.random()
		   int ch = (int)(AlphaNumericStr.length() * Math.random());

		   //adding Random character one by one at the end of s
		   s.append(AlphaNumericStr.charAt(ch));

		  }
		    return s.toString();
	}
	
	@Override
	public String LoginToAcc(LoginDto dto) throws LoginException {
		  Employee existingemp= emprepo.findByEmail(dto.getEmail());
			if(existingemp == null) {
				throw new LoginException("Please Enter a valid Email Id");
			}
			
			
	        Optional<UserSession> validCustomerSessionOpt =  sessionrepo.findById(existingemp.getId());
			if(validCustomerSessionOpt.isPresent()) {
				throw new LoginException("User already Logged In with this Email");
			}
			
			
			
	         if(existingemp.getPassword().equals(dto.getPass())) {
		    
	        	 
	        	String key=RandGeneratedStr(10);   // generating random string
				
				UserSession currentUserSession = new UserSession(existingemp.getId(),key);
				sessionrepo.save(currentUserSession);
				return currentUserSession.toString();
	        	 
			 }
			 else
				throw new LoginException("Please Enter a valid password");
			
	}

	@Override
	public String Logout(String key) throws LoginException {
		 UserSession validCustomerSession = sessionrepo.findByUuid(key);
			
	        System.out.println(validCustomerSession);
	        
			if(validCustomerSession == null) {
				throw new LoginException("User Not Logged In with this Email");
				
			}
			sessionrepo.delete(validCustomerSession);
			
			return "Logged Out !";
	}

}
