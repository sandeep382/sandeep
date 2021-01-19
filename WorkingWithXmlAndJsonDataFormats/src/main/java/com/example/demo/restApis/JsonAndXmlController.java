package com.example.demo.restApis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Employee;

@RestController
public class JsonAndXmlController {

	@GetMapping(value = "/emp", produces = {"application/xml", "application/json"})
	public Employee getEmployeeDetails() {
		Employee emp = new Employee();
		emp.setDesg("Developer");
		emp.setEmpId(1050);
		emp.setName("Sandeep");
		return emp;
	}

}
