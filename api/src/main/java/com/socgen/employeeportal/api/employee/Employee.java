package com.socgen.employeeportal.api.employee;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="EMPLOYEE")
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EMPLOYEE_ID")
	private Long id;
	
	@Column(name="EMPLOYEE_FIRST_NAME")
	private String firstName;
	
	@Column(name="EMPLOYEE_LAST_NAME")
	private String lastName;
	
	@Column(name="EMPLOYEE_GENDER")
	private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name="EMPLOYEE_DATE_OF_BIRTH")
	private Date dob;
	
	@Column(name="EMPLOYEE_DEPARTMENT")
	private String department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
