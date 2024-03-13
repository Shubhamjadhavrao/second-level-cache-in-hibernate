package com.Inheritance.mapedsuparclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassStd extends Student {
    @Id
    private int Std;
    @Column
    private String subject;
    @Column
    private int Marks;

    public ClassStd() {
	super();
	// TODO Auto-generated constructor stub
    }

    public ClassStd(String address, String schoolName, int std, String subject, int marks) {
	super(address, schoolName);
	Std = std;
	this.subject = subject;
	Marks = marks;
    }

    public int getStd() {
	return Std;
    }

    public void setStd(int std) {
	Std = std;
    }

    public String getSubject() {
	return subject;
    }

    public void setSubject(String subject) {
	this.subject = subject;
    }

    public int getMarks() {
	return Marks;
    }

    public void setMarks(int marks) {
	Marks = marks;
    }

    @Override
    public String toString() {
	return "ClassStd [Std=" + Std + ", subject=" + subject + ", Marks=" + Marks + "]";
    }

}
