package com.virtusa.hibernatedemo.client;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.virtusa.hibernatedemo.entity.Battery;
import com.virtusa.hibernatedemo.entity.Developer;
import com.virtusa.hibernatedemo.entity.Mobile;
import com.virtusa.hibernatedemo.entity.Product;
import com.virtusa.hibernatedemo.entity.Tester;

public class HibernateCriteriaMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		// select * from Product_Table
		/*CriteriaQuery criteria = session.createCriteria(Product.class);
		SimpleExpression simpleExpression1 = Restrictions.gt("price",250.00);	//gt - Greater than
		SimpleExpression simpleExpression2 = Restrictions.gt("productId",1002);
		LogicalExpression logicalExpression = Restrictions.and(simpleExpression1,simpleExpression2);
		
		criteria.add(logicalExpression);
		criteria.addOrder(Order.asc("productId"));
		
		List<Product> list = criteria.getOrderList();
		list.forEach(System.out::println);*/
		
		CriteriaQuery criteria = session.createCriteria(Product.class);
//		PropertyProjection projection = Projections.property("name");
		
		ProjectionList columnList = Projections.projectionList();
		columnList.add(Projections.property("productId")).
				   add(Projections.property("name"));
		
		criteria.setProjection(columnList);
		
		List<Object[]> list = criteria.getGroupList();
		list.forEach(System.out::println);
		
		for(Object[] objectArr:list) {
			for(Object obj:objectArr) {
				System.out.println(obj+" \t ");
			}
			System.out.println();
		}
		
		transaction.commit();
		session.close();
	}
}