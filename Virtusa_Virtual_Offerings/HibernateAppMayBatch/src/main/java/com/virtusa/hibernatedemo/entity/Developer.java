package com.virtusa.hibernatedemo.entity;

import javax.persistence.Entity;

@Entity
public class Developer extends Employee{
	private int noofLinesofCode;
	private int noofMethods;
	private int noofClasses;
	
	public Developer() {
		super();
	}

	public Developer(int noofLinesofCode, int noofMethods, int noofClasses) {
		super();
		this.noofLinesofCode = noofLinesofCode;
		this.noofMethods = noofMethods;
		this.noofClasses = noofClasses;
	}

	public int getNoofLinesofCode() {
		return noofLinesofCode;
	}

	public void setNoofLinesofCode(int noofLinesofCode) {
		this.noofLinesofCode = noofLinesofCode;
	}

	public int getNoofMethods() {
		return noofMethods;
	}

	public void setNoofMethods(int noofMethods) {
		this.noofMethods = noofMethods;
	}

	public int getNoofClasses() {
		return noofClasses;
	}

	public void setNoofClasses(int noofClasses) {
		this.noofClasses = noofClasses;
	}

	@Override
	public String toString() {
		return "Developer [noofLinesofCode=" + noofLinesofCode + ", noofMethods=" + noofMethods + ", noofClasses="
				+ noofClasses + "]";
	}
}
