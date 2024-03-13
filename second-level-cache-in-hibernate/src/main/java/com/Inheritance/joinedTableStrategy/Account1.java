package com.Inheritance.joinedTableStrategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Account1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String owner;
    @Column
    private Double IntrestRate;
    @Column
    private Double Balance;

    public Account1() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Account1(String owner, Double IntrestRatet, Double balance) {
	super();

	this.owner = owner;
	IntrestRate = IntrestRatet;
	Balance = balance;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getOwner() {
	return owner;
    }

    public void setOwner(String owner) {
	this.owner = owner;
    }

    public Double getIntrestRate() {
	return IntrestRate;
    }

    public void setIntrestRate(Double intrestRate) {
	IntrestRate = intrestRate;
    }

    public Double getBalance() {
	return Balance;
    }

    public void setBalance(Double balance) {
	Balance = balance;
    }

}
