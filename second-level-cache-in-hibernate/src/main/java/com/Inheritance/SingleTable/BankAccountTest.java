package com.Inheritance.SingleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.dao.HibernateUtil;

public class BankAccountTest {
    public static void main(String[] args) {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();

	CreditAccount a = new CreditAccount();
	a.setOwner("Ram");
	a.setBalance(50000.0);
	a.setCreditLimit(1000.0);
	a.setIntrestRate(11.0);

	DebitAccount d = new DebitAccount();
	d.setOwner("Ram");
	d.setBalance(50000.0);
	d.setOverDaraftFee(100.0);
	d.setIntrestRate(11.0);

	session.save(a);
	session.persist(d);//It's the step that triggers the actual insertion of data into the database table associated with the DebitAccount entity.
	
	transaction.commit();

	sessionFactory.close();

    }

}
