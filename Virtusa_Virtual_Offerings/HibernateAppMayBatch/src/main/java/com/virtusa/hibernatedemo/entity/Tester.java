package com.virtusa.hibernatedemo.entity;

import javax.persistence.Entity;

@Entity
public class Tester extends Employee{
	private int noofTestCases;
	private int noofBugsIdentified;
	
	public Tester() {
		super();
	}

	public Tester(int noofTestCases, int noofBugsIdentified) {
		super();
		this.noofTestCases = noofTestCases;
		this.noofBugsIdentified = noofBugsIdentified;
	}

	public int getNoofTestCases() {
		return noofTestCases;
	}

	public void setNoofTestCases(int noofTestCases) {
		this.noofTestCases = noofTestCases;
	}

	public int getNoofBugsIdentified() {
		return noofBugsIdentified;
	}

	public void setNoofBugsIdentified(int noofBugsIdentified) {
		this.noofBugsIdentified = noofBugsIdentified;
	}

	@Override
	public String toString() {
		return "Tester [noofTestCases=" + noofTestCases + ", noofBugsIdentified=" + noofBugsIdentified + "]";
	}
}
