package com.socgen.employeeportal.api.employee;

import java.util.List;

public interface EmployeeService {
	
	boolean registerEmployee(Employee employee);

	List<Employee> employeeList();
}
