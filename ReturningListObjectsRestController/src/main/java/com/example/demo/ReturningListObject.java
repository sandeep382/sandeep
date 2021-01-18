package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturningListObject {

	@GetMapping(value = "/getStudent")
	public StudentDTO getStudentDetails() {

		StudentDTO dto = new StudentDTO();

		List<Student> list = new ArrayList<>();

		Student student = new Student();
		student.setAdress("Hyderabad");
		student.setLocation("Hille colony");
		student.setName("Sandeep");

		Student student1 = new Student();
		student1.setAdress("Hyderabad");
		student1.setLocation("Hille colony");
		student1.setName("Sandeep");

		list.add(student);
		list.add(student1);

		dto.setStudent(list);

		return dto;
	}

}
