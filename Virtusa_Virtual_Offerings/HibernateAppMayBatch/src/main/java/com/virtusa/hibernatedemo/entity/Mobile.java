package com.virtusa.hibernatedemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mobile_Table")
public class Mobile {
	
	@Id
	@Column(name="IMEI")
	private int IMEInumber;
	@Column(name="comapny",length=30)
	private String company;
	@Column(name="model",length=30)
	private String model;
	private double price;

	@OneToOne(fetch=FetchType.LAZY)
	private Battery battery;
	
	public Mobile() {
		
	}

	public Mobile(int iMEInumber, String company, String model, double price) {
		super();
		IMEInumber = iMEInumber;
		this.company = company;
		this.model = model;
		this.price = price;
	}

	public int getIMEInumber() {
		return IMEInumber;
	}

	public void setIMEInumber(int iMEInumber) {
		IMEInumber = iMEInumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [IMEInumber=" + IMEInumber + ", company=" + company + ", model=" + model + ", price=" + price
				+ ", battery=" + battery + "]";
	}
}
