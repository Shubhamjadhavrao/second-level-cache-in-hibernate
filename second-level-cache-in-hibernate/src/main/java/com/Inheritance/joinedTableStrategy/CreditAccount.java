package com.Inheritance.joinedTableStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "Acconut_id")
public class CreditAccount extends Account1 {
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
