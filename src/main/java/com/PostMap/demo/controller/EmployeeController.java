package com.PostMap.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PostMap.demo.model.Employee;
import com.PostMap.demo.model.EmployeeAddress;
import com.PostMap.demo.service.EmployeeService;

@RestController
@RequestMapping("/employeeMapppings")
public class EmployeeController {

	@Autowired
	private EmployeeService emp_service;

	@PostMapping(value = "/createEmployee/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Employee> createEmployees(@PathVariable("id") Integer id, @RequestParam("name") String name,
			@RequestBody EmployeeAddress address) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "application/json");
		headers.add("locale", "en_US");
		return ResponseEntity.accepted().headers(headers).body(emp_service.createEmployees(id, name, address));
	}

}
