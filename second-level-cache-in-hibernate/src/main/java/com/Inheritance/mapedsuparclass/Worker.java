package com.Inheritance.mapedsuparclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Worker extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int salary;
    @Column
    private String Garde;

    public Worker() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Worker(int heigth, int weigth,  int salary, String garde) {
	super(heigth, weigth);
	
	this.salary = salary;
	Garde = garde;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getSalary() {
	return salary;
    }

    public void setSalary(int salary) {
	this.salary = salary;
    }

    public String getGarde() {
	return Garde;
    }

    public void setGarde(String garde) {
	Garde = garde;
    }

    @Override
    public String toString() {
	return "Worker [id=" + id + ", salary=" + salary + ", Garde=" + Garde + "]";
    }

}
