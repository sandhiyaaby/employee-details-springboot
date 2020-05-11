package com.PostMap.demo.model;



public class Employee {
	Integer id;
	String name;
	EmployeeAddress address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public EmployeeAddress getAddress() {
		return address;
	}



	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}



	public Employee(Integer id, String name, EmployeeAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
