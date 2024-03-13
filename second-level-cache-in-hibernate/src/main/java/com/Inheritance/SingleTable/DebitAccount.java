package com.Inheritance.SingleTable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DebitAccount extends Account {
    @Column
    private Double OverDaraftFee;

    public DebitAccount() {
	super();
	// TODO Auto-generated constructor stub
    }

    public DebitAccount(Double overDaraftFee) {
	super();
	OverDaraftFee = overDaraftFee;
    }

    public Double getOverDaraftFee() {
	return OverDaraftFee;
    }

    public void setOverDaraftFee(Double overDaraftFee) {
	OverDaraftFee = overDaraftFee;
    }

    @Override
    public String toString() {
	return "DebitAccount [OverDaraftFee=" + OverDaraftFee + "]";
    }

}
