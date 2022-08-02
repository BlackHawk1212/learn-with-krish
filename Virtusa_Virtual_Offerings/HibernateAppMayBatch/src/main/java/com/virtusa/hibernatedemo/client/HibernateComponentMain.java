package com.virtusa.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernatedemo.entity.Address;
import com.virtusa.hibernatedemo.entity.Person;

public class HibernateComponentMain {

	public static void main(String[] args) throws InterruptedException {
		Person person = new Person(101,"Per1",23);
		Address address = new Address("123","city1",123);
		person.setAddress(address);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(person);
		
		transaction.commit();
		session.close();
	}
}