package com.example.demo.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String name;
	private String desg;
	private Integer empId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", desg=" + desg + ", empId=" + empId + "]";
	}

}
