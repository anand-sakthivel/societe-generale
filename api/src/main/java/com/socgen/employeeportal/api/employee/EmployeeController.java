package com.socgen.employeeportal.api.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@ResponseBody
	@PostMapping("/registerEmployee")
	public ResponseEntity<Boolean> registerEmployee(@RequestBody Employee employee) {
		boolean state = this.employeeService.registerEmployee(employee);
		if(state) {
			return ResponseEntity.ok(true);
		} else {
			return ResponseEntity.ok(false);
		}
	}
	
	@ResponseBody
	@GetMapping("/employeeList")
	public ResponseEntity<List<Employee>> employeeList() {
		List<Employee> employeeList = this.employeeService.employeeList();
		return ResponseEntity.ok(employeeList);
	}
	
}
