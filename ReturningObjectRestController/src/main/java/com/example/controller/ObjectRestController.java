package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.helper.Employee;

@RestController
public class ObjectRestController {

	@GetMapping(value = "/getEmp/{empId}", produces = "appliation/json")
	public Employee getEmployeeDetails(@PathVariable("empId") Integer empId) {
		Employee employee = new Employee();

		if (1050 == empId) {
			employee.setEmployeeId(empId);
			employee.setDesg("Developer");
			employee.setAddress("Hyderabad");
			employee.setName("Sandeep");
		} else if (1048 == empId) {
			employee.setEmployeeId(empId);
			employee.setDesg("Developer");
			employee.setAddress("Hyderabad");
			employee.setName("Venkat");
		}
		return employee;

	}

}
