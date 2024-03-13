package com.Inheritance.SingleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.dao.HibernateUtil;

public class SingleTableTest {
    public static void main(String[] args) {
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	
	Pen pen = new Pen("BallPen", "Black", 10);
	Book book = new Book("java edition", "Herbalt Shidln", 5422);
	
	session.save(pen);
	session.save(book);
	transaction.commit();
	
	factory.close();
    }

}
