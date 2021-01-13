package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryParamController {

	/*Working with singlt path parameter*/
	@GetMapping(value = "/time/{hours}")
	public String getCurrentDate(@PathVariable("hours") Integer hour) {
		if (hour < 12) {
			return "Hello very good morning";
		} else if (hour > 12 & hour < 16) {
			return "Hello Very good evening";
		} else {
			return "good night";
		}
	}

	/*Working with multiple path parameter*/
	@GetMapping(value = "gatnameage/{name}/{age}")
	public String getNameAndAge(@PathVariable("name") String name, @PathVariable("age") Integer age) {
		if (null == name) {
			return "Please provide valid details and try again";
		} else {
			return  "Thanks for the details MR: "+ name + "  and u r now at the age of " + age  + " u have a bright future so dont  loose hope";
		}
	}
	
	
	/*path params at midddle of the url*/
	@GetMapping(value = "/wish/{msg}/today/{what}")
	public String wishMessage(@PathVariable("msg") String wishMessage, @PathVariable("what") String whatToday) {
		if (null != wishMessage & null != whatToday) {
			return wishMessage + "  "+ whatToday;
		} else {
			return "Today is BHOGI and i wish u and u r family a wish happy BHOGI";
		}

	}

}
