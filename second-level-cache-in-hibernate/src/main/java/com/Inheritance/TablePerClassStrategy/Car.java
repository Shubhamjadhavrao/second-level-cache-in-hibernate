package com.Inheritance.TablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Car(String manufacturer, String model, int year, int numberOfDoors) {
	super(manufacturer, model, year);
	this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
	return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
	this.numberOfDoors = numberOfDoors;
    }

}
