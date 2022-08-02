package com.virtusa.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernatedemo.entity.Developer;
import com.virtusa.hibernatedemo.entity.Tester;

public class HibernateInheriMappingMain {

	public static void main(String[] args) throws InterruptedException {
		Developer developer = new Developer(1000,50,5);
		developer.setEmpId(1001);
		developer.setEmpname("emp1");
		developer.setAge(21);
		
		Tester tester = new Tester(10,50);
		tester.setEmpId(1001);
		tester.setEmpname("emp2");
		tester.setAge(21);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(developer);
		session.save(tester);
		
		transaction.commit();
		session.close();
	}
}