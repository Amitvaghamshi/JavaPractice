package com.masai.config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class AppConfig{

	@Bean
	public SecurityFilterChain springSecurityConfiguration(HttpSecurity http) throws Exception {

		http
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)  // it says that dont create jssion id means inbuilt token
		.and()
		.csrf().disable()
		
        .cors().configurationSource( new CorsConfigurationSource(){
			
			@Override
			public CorsConfiguration getCorsConfiguration(HttpServletRequest request){
				
				CorsConfiguration cfg = new CorsConfiguration();
				
				cfg.setAllowedOrigins(Collections.singletonList("*"));
				//cfg.setAllowedOrigins(Arrays.asList("http://localhost:4200", "http://localhost:4500"));
				//cfg.setAllowedMethods(Arrays.asList("GET", "POST","DELETE","PUT"));
				cfg.setAllowedMethods(Collections.singletonList("*"));
				cfg.setAllowCredentials(true);
				cfg.setAllowedHeaders(Collections.singletonList("*"));
				cfg.setExposedHeaders(Arrays.asList("Authorization"));
				cfg.setMaxAge(3600L);
				return cfg;
			}
		})
		.and()
		.authorizeHttpRequests()
		.requestMatchers(HttpMethod.POST, "/register").permitAll()
		.requestMatchers(HttpMethod.GET,"/helloadmin").hasAnyRole("ADMIN")
		.requestMatchers(HttpMethod.GET,"/hellouser").hasAnyRole("USER","ADMIN")
		.anyRequest()
		.authenticated()
		.and()
		.addFilterAfter(new JwtTokenGeneratorFilter(), BasicAuthenticationFilter.class)  // generater filter should be on after basicauthentication
		.addFilterBefore(new JwtTokenValidatorFilter(), BasicAuthenticationFilter.class)  //  // validator filter should be on before basicauthentication
		.formLogin()
		.and()
		.httpBasic();   // it gives permission to other software like react ,js

		return http.build();

	}

	@Bean 
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();

	}
}
