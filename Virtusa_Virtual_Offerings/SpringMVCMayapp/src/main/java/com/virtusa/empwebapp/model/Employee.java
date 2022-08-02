package com.virtusa.empwebapp.model;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class Employee {
	
	@NotEmpty(message="User name cannot be empty")
	private String username;
	@NotEmpty(message="User password cannot be empty")
	@Length(min=8, message="Password cannot be less than 8 characters")
	private String password;
	private String designation;
	private int age;
	private String fullname;
	private int employeeId;
	private String[] gender;
	
	public Employee() {
		
	}

	public Employee(String username, String password, String designation, int age, String fullname, int employeeId) {
		super();
		this.username = username;
		this.password = password;
		this.designation = designation;
		this.age = age;
		this.fullname = fullname;
		this.employeeId = employeeId;
	}

	public String[] getGender() {
		return gender;
	}

	public void setGender(String[] gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", designation=" + designation + ", age="
				+ age + ", fullname=" + fullname + ", employeeId=" + employeeId + ", gender=" + Arrays.toString(gender)
				+ "]";
	}
}
