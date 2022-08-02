package com.virtusa.hibernatedemo.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String hNo;
	private String city;
	private int pinCode;
	
	public Address() {
		super();
	}

	public Address(String hNo, String city, int pinCode) {
		super();
		this.hNo = hNo;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
}
