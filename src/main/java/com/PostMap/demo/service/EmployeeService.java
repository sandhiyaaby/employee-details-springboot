package com.PostMap.demo.service;

import org.springframework.http.HttpHeaders;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.PostMap.demo.model.Employee;
import com.PostMap.demo.model.EmployeeAddress;

import lombok.NoArgsConstructor;

@Service
public class EmployeeService {

	public Employee createEmployees(Integer id, String name, EmployeeAddress address) {
		name="its their way";
		return new Employee(id, name, address);
	}
}
