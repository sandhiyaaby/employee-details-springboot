package com.PostMap.demo.serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.PostMap.demo.model.EmployeeAddress;
import com.PostMap.demo.service.EmployeeService;

@SpringBootTest
class EmployeeServiceTest {

	@Mock
	private EmployeeAddress eaddress;

	@InjectMocks
	private EmployeeService emp_service;
	
	@Test
	void employeeServiceClassTest() {
		
		eaddress.setNo(1002);
		eaddress.setStreet("wallstreet");
		
		emp_service.createEmployees(101, "ABC", eaddress);
	}

}
