package com.Inheritance.mapedsuparclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class myEmployee extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String Name;
    @Column
    private String Department;

    public myEmployee() {
	super();
	// TODO Auto-generated constructor stub
    }

   
    public myEmployee(int heigth, int weigth, String name, String department) {
	super(heigth, weigth);
	
	Name = name;
	Department = department;
    }


    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return Name;
    }

    public void setName(String name) {
	Name = name;
    }

    public String getDeoartment() {
	return Department;
    }

    public void setDeoartment(String department) {
	Department = department;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", Department=" + Department + "]";
    }

}
