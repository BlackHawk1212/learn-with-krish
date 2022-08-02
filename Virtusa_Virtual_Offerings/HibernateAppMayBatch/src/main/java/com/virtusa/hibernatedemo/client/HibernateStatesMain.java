package com.virtusa.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernatedemo.entity.Product;

public class HibernateStatesMain {

	public static void main(String[] args) throws InterruptedException {
//		Product product = new Product(1001,"P1",100.00,new Date());
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		session.save(product); // Persistent object
		
		Product product = (Product) session.get(Product.class, 1001);
		session.evict(product); //Clear the cache memory 
		
		
//		Product product1 = (Product) session.get(Product.class, 1001);
		
		product.setPrice(400); 
		System.out.println(product); //400
		
		
		transaction.commit();
		session.close();
		
		System.out.println(product); //400 //Detached
	}
}