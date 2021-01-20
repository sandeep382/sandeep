package com.example.demo.resources;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.TicketInfo;
import com.example.demo.response.ConformTicket;

@RestController
public class ConformTicketController {

	@PostMapping(value = "/ticketDetails", produces = { "application/json", "application/xml"},
			consumes = {"application/xml", "application/json"})
	public ConformTicket bookTicket(@RequestBody TicketInfo ticketInfo) {
		ConformTicket conformTicket = new ConformTicket();
		conformTicket.setPassengerName(ticketInfo.getName());
		conformTicket.setTicketNumber("H54E55");
		conformTicket.setTrackingId(UUID.randomUUID().toString());
		return conformTicket;
	}
	
	/*Use below data formats to give the input*/
	
	/*
	 * 
	 * { "source" : "Hyderabad", "destination": "Ongole", "noOfTickets":1,
	 * "journeyDate": 25-01-2020, "name": "Sandeep" }
	 * 
	 * <cnfmticket> <source>Hyderabad</source> <destination>Ongole</destination>
	 * <noOfTickets>1</noOfTickets> <journeyDate>25-21-2020</journeyDate>
	 * <name>Sandeep</name> </cnfmticket>
	 * 
	 * 
	 * 
	 */

}
