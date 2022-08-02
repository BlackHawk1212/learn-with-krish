package com.virtusa.hibernatedemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Battery_Table")
public class Battery {
	
	@Id
	private int batteryId;
	private int capacity;
	private double price;
	
	@OneToOne(mappedBy="battery",cascade=CascadeType.ALL)
	Mobile mobile;
	
	public Battery() {
		
	}

	public Battery(int batteryId, int capacity, double price) {
		super();
		this.batteryId = batteryId;
		this.capacity = capacity;
		this.price = price;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public int getBatteryId() {
		return batteryId;
	}

	public void setBatteryId(int batteryId) {
		this.batteryId = batteryId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Battery [batteryId=" + batteryId + ", capacity=" + capacity + ", price=" + price + "]";
	}
}
