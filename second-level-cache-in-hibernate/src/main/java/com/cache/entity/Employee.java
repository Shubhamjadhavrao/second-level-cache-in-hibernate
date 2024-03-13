package com.cache.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
        private int id;
    @Column
        private String name;
    @Column
        private String Department;
    @Column
        private double salary;
    
    public Employee() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Employee(String name, String department, double salary) {
	super();
	this.name = name;
	Department = department;
	this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Department=" + Department + ", salary=" + salary + "]";
    }
    
    
    
    
}
