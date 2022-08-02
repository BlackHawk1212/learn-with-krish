package com.virtusa.hibernatedemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Table")
public class Product {
	@Id
	@Column(name="p_id")
	@GeneratedValue
	private int productId;
	@Column(name="p_name")
	private String name;
	@Column(name="p_price")
	private double price;
	@Column(name="p_mDate")
	private Date mDate;
	
	public Product() {
		super();
	}
	
	public Product(int productId, String name, double price, Date mDate) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.mDate = mDate;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", mDate=" + mDate + "]";
	}
}
