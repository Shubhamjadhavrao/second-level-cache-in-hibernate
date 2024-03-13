package com.cache.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.entity.Employee;

public class EmployeeDao {
    public static void main(String[] args) {

	Employee employee = new Employee("Raj","IT",12342);
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();
	Transaction transaction1 = session.beginTransaction();

	Employee emp1 = session.get(Employee.class, 1);
        System.out.println(emp1);
//        session.save(employee);
	transaction1.commit();
	session.close();
System.out.println("------------------------------------------------------------------------------");
	Session session2 = sessionFactory.openSession();

	Transaction transaction2 = session2.beginTransaction();

	Employee emp2 = session2.get(Employee.class, 1);
	System.out.println(emp2);

	transaction2.commit();
	session2.close();
	sessionFactory.close();
    }
}
