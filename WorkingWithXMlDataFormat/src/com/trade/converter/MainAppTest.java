package com.trade.converter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.trade.domain.Employee;

public class MainAppTest {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {

		Employee emp = new Employee();
		emp.setAddress("Vanapuram");
		emp.setEmpId("SEBJ1500");
		emp.setName("Sandeep");

		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(emp, System.out);
		marshaller.marshal(emp, new FileOutputStream("emp.xml"));

	}

}
