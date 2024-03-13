package com.Inheritance.mapedsuparclass;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
    @Column
    private int Heigth;
    @Column
    private int Weigth;

    public Person() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Person(int heigth, int weigth) {
	super();
	Heigth = heigth;
	Weigth = weigth;
    }

    public int getHeigth() {
	return Heigth;
    }

    public void setHeigth(int heigth) {
	Heigth = heigth;
    }

    public int getWeigth() {
	return Weigth;
    }

    public void setWeigth(int weigth) {
	Weigth = weigth;
    }

    @Override
    public String toString() {
	return "Person [Heigth=" + Heigth + ", Weigth=" + Weigth + "]";
    }

}
