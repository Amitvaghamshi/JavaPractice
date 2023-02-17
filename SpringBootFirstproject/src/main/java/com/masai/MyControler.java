package com.masai;


import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
//@controller
@RequestMapping("my")
public class MyControler{

	//@RequestMapping(value = "/name",method = RequestMethod.GET,produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping("am")
	//@ResponseBody
	public Student getStudentHandler() {
	Student student = new Student("Ram", "Delhi", 780);
	return student;
	}
	
	
	@RequestMapping("/names")
	//@ResponseBody
	public String name() {
		return "Wel-come";
	}
}
