package com.virtusa.hibernatedemo.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernatedemo.entity.Product;

public class HibernateSimpleMappingMain {

	public static void main(String[] args) throws InterruptedException {
		Product product = new Product(1001,"P1",100.00,new Date());
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(product);
		
//		session.delete(product);
		
		Product prod = (Product)session.load(Product.class, 1001); // Lazy loading
//		System.out.println("1");
//		Thread.sleep(2000);
		System.out.println(prod);
		
//		Product prod = (Product)session.get(Product.class, 1001); // Eager
//		System.out.println(prod);
		
		transaction.commit();
		
		session.close();
	}
}

/*
* Perform CRUD Operations
*
* Insert - 1. Save    - Returns Id
*          2. Persist - Returns void
*          
* Delete - 1. Delete  - Object with Id
* 
* Update - 1. Update  - Object with Primary key
* 
* Select - 1. Load
*          2. Get 
* 
* Insert or Update - 1. saveOrUpdate
*                    2. Merge
*/