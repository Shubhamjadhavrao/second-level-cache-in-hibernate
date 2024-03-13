package com.Inheritance.SingleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@DiscriminatorValue("My_Pen")
public class Pen extends Product {
    @Column
    private String Color;
    @Column
    private int Price;

    public Pen() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Pen(String name, String color, int price) {
	super(name);
	Color = color;
	Price = price;
    }

    public String getColor() {
	return Color;
    }

    public void setColor(String color) {
	Color = color;
    }

    public int getPrice() {
	return Price;
    }

    public void setPrice(int price) {
	Price = price;
    }

    @Override
    public String toString() {
	return "Pen [Color=" + Color + ", Price=" + Price + "]";
    }

}
