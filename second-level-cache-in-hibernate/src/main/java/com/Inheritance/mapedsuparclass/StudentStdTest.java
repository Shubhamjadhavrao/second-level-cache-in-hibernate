package com.Inheritance.mapedsuparclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.dao.HibernateUtil;

public class StudentStdTest {
    public static void main(String[] args) {
	 
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	 Transaction transaction = session.beginTransaction();
	 
	 Student1 student1 = new Student1("Pune", "ABC", "Rajveer", 12354365);
	  ClassStd classStd = new ClassStd("Pune", "ABC", 5, "Maths", 36);
	  
	  session.save(student1);
	  session.save(classStd);
	  transaction.commit();
	  sessionFactory .close();
		  
	 
    }

}
