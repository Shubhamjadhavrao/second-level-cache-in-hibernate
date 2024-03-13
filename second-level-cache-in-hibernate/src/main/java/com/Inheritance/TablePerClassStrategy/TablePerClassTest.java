package com.Inheritance.TablePerClassStrategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cache.dao.HibernateUtil;

public class TablePerClassTest {
    public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	 Transaction transaction = session.beginTransaction();
	 
	 Car car  = new  Car();
	 car.setManufacturer("Toyota");
	 car.setModel("Camry");
	 car.setYear(2022);
	 car.setNumberOfDoors(4);
	 
	 Truck truck  = new Truck();
	 truck.setManufacturer("Ford");
	 truck.setModel("F-150");
	 truck.setYear(2021);
	 truck.setCargoCapacity(5000);
	   
	 session.save(car);
	 session.save(truck);
	
	 transaction.commit();
	 session.close();
	 sessionFactory.close();
    }
    

}
