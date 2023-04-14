package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepository;

@Service
public class UsersUserDetailService implements UserDetailsService{
	
	@Autowired
	private StudentRepository studetrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		  Optional<Student> st=studetrepo.findByEmail(username);
		
		  if(st.isPresent()){
			  
			  Student act=st.get();
			  
			  List<GrantedAuthority> autorities=new ArrayList<>();
			  
			  SimpleGrantedAuthority au=new SimpleGrantedAuthority(act.getRole());
			  autorities.add(au);
			  
			  return new User(act.getEmail(), act.getPassword(), autorities);
			  
		  }else {
			  throw new UsernameNotFoundException("User not found with this username");
		  }
	}

}
