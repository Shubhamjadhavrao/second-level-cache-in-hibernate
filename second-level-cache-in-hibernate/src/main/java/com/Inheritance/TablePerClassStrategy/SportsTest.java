package com.Inheritance.TablePerClassStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.dao.HibernateUtil;

public class SportsTest {
    public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	

	Cricket cricket = new Cricket();
	cricket.setName("Cricket");
	cricket.setP_name("MS.Dhoni");
	cricket.setTeam("India");
	session.persist(cricket);

	Kabbadi kabbadi = new Kabbadi();
	kabbadi.setName("Kabbadi");
	kabbadi.setP_name("Kumar");
	kabbadi.setTeam("U Mumba");

	session.persist(kabbadi);
	
//	 Sports sports = new Sports("Cricket");
//	 session.save(sports);
	 
	transaction.commit();
	session.close();
	sessionFactory.close();

    }

}
