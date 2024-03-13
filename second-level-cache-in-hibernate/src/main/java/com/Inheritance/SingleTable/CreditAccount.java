package com.Inheritance.SingleTable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CreditAccount extends Account {
    @Column
    private Double CreditLimit;

    public CreditAccount() {
	super();
	// TODO Auto-generated constructor stub
    }

    public CreditAccount(Double creditLimit) {
	super();
	CreditLimit = creditLimit;
    }

    public Double getCreditLimit() {
	return CreditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
	CreditLimit = creditLimit;
    }

    @Override
    public String toString() {
	return "CreditAccount [CreditLimit=" + CreditLimit + "]";
    }

}
