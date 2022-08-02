package com.virtusa.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person_Table")
public class Person {
	@Id
	@Column(name="per_id")
	private int personId;
	@Column(name="p_name")
	private String name;
	private int age;
	@Embedded
	private Address address;
	
	public Person() {
		super();
	}

	public Person(int personId, String name, int age) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
