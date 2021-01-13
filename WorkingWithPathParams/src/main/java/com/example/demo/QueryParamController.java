package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/parent")
public class QueryParamController {

	@RequestMapping(value  = "/name", method = RequestMethod.GET)
	public String getName(@RequestParam("nm") String name) {
		System.out.println("Entered name is " + name);
		return "This is provided name " + name;
	}
	
	@GetMapping("/age")
	public Integer getAgeOfPerson(@RequestParam(name = "age", required = false, defaultValue = "50") Integer age) {
		return age;
	}
	
	
}
