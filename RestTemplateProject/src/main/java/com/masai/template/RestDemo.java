package com.masai.template;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class RestDemo{

	@Autowired
	private RestTemplate resttemp;
	
	// get Operation
	@GetMapping("/getall")
	public ResponseEntity<Plant[]> getdata() {
		HttpHeaders hh=new HttpHeaders();
		hh.add("Content-Type", "application/json");
		hh.setAccept(Arrays.asList(MediaType.APPLICATION_JSON ));
		
		HttpEntity<String> entity=new HttpEntity<>(hh);
		System.out.println("Inside controller");
		
		ResponseEntity<Plant[]> str= resttemp.exchange("http://localhost:8080/plant/all", HttpMethod.GET, entity, Plant[].class);
		 
		return str;
		
	//	System.out.println(str.getBody());
		
	
		  
	}
	
	// Post operation
	public void postPlant() {
		  Plant p=new Plant();
		//  p.setPlantId(12);
		  p.setTypeOfPlant("ant");
		  p.setBloomTime("2month");
		  p.setCommonName("mirchi");
		  p.setPlantHeight(12);
	      p.setTemprature("150c");
	   	  p.setMedicalOrCulinaryUse("hee");
	      p.setPlantSpread("234ft");
	      p.setDifficultyLevel("hard");
	      p.setPlantDescription("khao to maja avse temo will reach 150C");
		
	   HttpHeaders hh=new HttpHeaders();
	   hh.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	   
	 
	   HttpEntity<Plant> entity=new HttpEntity<Plant>(p,hh);
	   entity.hasBody();
	   
	   ResponseEntity<String> res= resttemp.exchange("http://localhost:8080/plant/add",HttpMethod.POST,entity,String.class);
	   System.out.println(res.getBody());
	   
	}
	
	
	
	// UPDATE PLANT
	public void updatePlant() {
		Plant p=new Plant();
		  p.setPlantId(102);
		  p.setTypeOfPlant("ant");
		  p.setBloomTime("2month");
		  p.setCommonName("karela");
		  p.setPlantHeight(12);
	      p.setTemprature("50c");
	   	  p.setMedicalOrCulinaryUse("hee");
	      p.setPlantSpread("234ft");
	      p.setDifficultyLevel("hard");
	      p.setPlantDescription("khao to maja avse nahi to nahi ave but plant updated");
	      
	      HttpHeaders hh=new HttpHeaders();
	      hh.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      
	      HttpEntity<Plant> entity=new HttpEntity<>(p,hh);
	      
	       ResponseEntity<String> res=  resttemp.exchange("http://localhost:8080/plant/update",HttpMethod.PUT,entity,String.class);
	       System.out.println(res.getBody());
	       
	       
	}
	
	
	// DELETE PLANT
	public void deleteplant(Integer pantId){
		   HttpHeaders hh=new HttpHeaders();
		   hh.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		   
		   HttpEntity<String> entity=new HttpEntity<>(hh);
		   
		  ResponseEntity<String> res=resttemp.exchange("http://localhost:8080/plant/delete/"+pantId, HttpMethod.DELETE,entity,String.class);
		  System.out.println(res.getBody());
	}
	
}
