package com.trade.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties({ "mobilrNumber", "pinCode" })
@JsonInclude(value = Include.NON_EMPTY)
public class Customer {

	@JsonProperty("customerName")
	private String name;
	private String address;
	private String city;
	// @JsonIgnore
	private Long mobilrNumber;

	// @JsonIgnore
	private int pinCode;

	public void setMobilrNumber(Long mobilrNumber) {
		this.mobilrNumber = mobilrNumber;
	}

	public Long getMobilrNumber() {
		return mobilrNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getPinCode() {
		return pinCode;
	}

}
