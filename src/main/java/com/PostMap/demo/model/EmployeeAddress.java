package com.PostMap.demo.model;


public class EmployeeAddress {
	Integer no;
	String street;
	public EmployeeAddress() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeAddress(Integer no, String street) {
		super();
		this.no = no;
		this.street = street;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
}
