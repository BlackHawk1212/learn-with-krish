package com.virtusa.hibernatedemo.client;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernatedemo.entity.Battery;
import com.virtusa.hibernatedemo.entity.Developer;
import com.virtusa.hibernatedemo.entity.Mobile;
import com.virtusa.hibernatedemo.entity.Product;
import com.virtusa.hibernatedemo.entity.Tester;

public class HibernateHQLMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Query query = session.createQuery("from Product");
//		Query query = session.createQuery("select p from Product as p");
//		Query query = session.createQuery("select p from Product as p where p.price > 200 order by p.productId desc");
		
		/*Query query = session.createQuery("select p from Product as p");
		query.setMaxResults(1);
		query.setFirstResult(1);
		
		List<Product> list = query.getResultList();	//eager iterate	//lazy
		
		list.forEach(System.out::println);*/
		
		Query query = session.createQuery("select p.productId,p.name,p.price from Product as p");
		List<Object[]> productList = query.getResultList();
		
		for(Object[] objectArr:productList) {
			for(Object obj:objectArr) {
				System.out.println(obj+" \t ");
			}
			System.out.println();
		}
		
		transaction.commit();
		session.close();
	}
}