package com.trade.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trade.domain.Customer;

public class JsonConverter {

	public static void main(String[] args) throws JsonProcessingException {

		Customer customer = new Customer();
		customer.setAddress("Telangana");
		customer.setCity("Hyderabad");
		customer.setName("Sandeep");

		ObjectMapper objectMapper = new ObjectMapper();
		String writeValueAsString = objectMapper.writeValueAsString(customer);
		System.out.println(writeValueAsString);

	}

}
