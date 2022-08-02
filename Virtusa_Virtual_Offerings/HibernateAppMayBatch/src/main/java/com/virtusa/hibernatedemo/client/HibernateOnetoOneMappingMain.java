package com.virtusa.hibernatedemo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernatedemo.entity.Battery;
import com.virtusa.hibernatedemo.entity.Developer;
import com.virtusa.hibernatedemo.entity.Mobile;
import com.virtusa.hibernatedemo.entity.Tester;

public class HibernateOnetoOneMappingMain {

	public static void main(String[] args) throws InterruptedException {
		Mobile mobile = new Mobile(123,"A","A1",100);
		Battery battery = new Battery(1,2000,100);
		
		mobile.setBattery(battery);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		session.save(mobile);
//		session.save(battery);
		
		// Eager loading
//		Mobile mobile1 = (Mobile) session.get(Mobile.class, 101);	//Load Mobile data as well as the Battery data too
//		Battery battery1 = (Battery) session.get(Battery.class, 101);	//Load only Battery details
		
		// Once you fetch the 1 to 1 as Lazy in Mobile class Battery data won't loaded
//		Mobile mobile1 = (Mobile) session.get(Mobile.class, 101);
//		System.out.println(;mobile.getBattery());	// Lazy loading of Battery object
		
		Battery battery1 = (Battery) session.get(Battery.class, 101);
		session.delete(battery1);	//Since the violating child record in Mobile we have to apply cascade type in Battery class
		
		transaction.commit();
		session.close();
	}
}