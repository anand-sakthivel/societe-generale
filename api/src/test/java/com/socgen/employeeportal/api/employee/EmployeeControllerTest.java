package com.socgen.employeeportal.api.employee;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

public class EmployeeControllerTest {

	@Mock
	EmployeeService employeeService;
	
	EmployeeController employeeController; 
	
	@BeforeAll
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		employeeController = new EmployeeController(employeeService);
	}
	
	@Test
	public void registerEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("Anand");
		employee.setFirstName("Sakthivel");
		employee.setGender("Male");
		employee.setDob(new Date());
		employee.setDepartment("IS-IT");
		ResponseEntity<Boolean> result = employeeController.registerEmployee(employee);
		
		assertTrue(result.getStatusCode().value() == 200);
	}
	
	@Test
	public void exployeeList() {
		ResponseEntity<List<Employee>> result = employeeController.employeeList();
		assertNotNull(result.getBody());
	}
}
