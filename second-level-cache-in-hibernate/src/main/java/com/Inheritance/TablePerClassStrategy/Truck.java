package com.Inheritance.TablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck() {
	super();
	// TODO Auto-generated constructor stub
    }
    

    public Truck(String manufacturer, String model, int year, int cargoCapacity) {
	super(manufacturer, model, year);
	this.cargoCapacity = cargoCapacity;
    }
    

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

  
}
