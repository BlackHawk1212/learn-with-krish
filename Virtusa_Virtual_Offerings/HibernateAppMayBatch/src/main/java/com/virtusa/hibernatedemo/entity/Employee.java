package com.virtusa.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Table")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) 
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empname;
	private int age;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empname, int age) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", age=" + age + "]";
	}
}
