package com.socgen.employeeportal.api.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public boolean registerEmployee(Employee employee) {
		Employee savedEmployee = this.employeeRepository.save(employee);
		if(savedEmployee.getId() != null) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public List<Employee> employeeList() {
		List<Employee> employeeList = this.employeeRepository.getEmployeeList();
		return employeeList != null ? employeeList : null;
	}
}
