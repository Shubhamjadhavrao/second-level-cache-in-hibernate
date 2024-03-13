package com.Inheritance.mapedsuparclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.dao.HibernateUtil;

public class TestMapSuparclass {
    public static void main(String[] args) {

	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();

	myEmployee myEmployee = new myEmployee(5, 45, "sham", "Accounting");

	Worker worker = new Worker(5, 48, 4321, "ChaterdAccountant");

	session.save(myEmployee);
	session.save(worker);
	transaction.commit();

	factory.close();

    }
}
