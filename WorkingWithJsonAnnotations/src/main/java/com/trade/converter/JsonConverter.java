package com.trade.converter;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trade.domain.Customer;

public class JsonConverter {

	public static void main(String[] args) throws JsonProcessingException {
		List<Customer> listOfCustomr = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			Customer customer = new Customer();
			customer.setAddress("Telangana " + i);
			customer.setCity("Hyderabad " + i);
			customer.setName("Sandeep " + i);
			//customer.setMobilrNumber(8897270747L);
			//customer.setPinCode(500070);
			listOfCustomr.add(customer);
		}
		ObjectMapper objectMapper = new ObjectMapper();
		String writeValueAsString = objectMapper.writeValueAsString(listOfCustomr);
		System.out.println(writeValueAsString);
		// printing in json style format
		String prettyWriterFormat = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(listOfCustomr);
		System.out.println(prettyWriterFormat);

	}

}
