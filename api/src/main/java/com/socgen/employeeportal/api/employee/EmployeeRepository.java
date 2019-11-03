package com.socgen.employeeportal.api.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(" SELECT employee FROM Employee employee ORDER BY employee.firstName")
	List<Employee> getEmployeeList();
}
