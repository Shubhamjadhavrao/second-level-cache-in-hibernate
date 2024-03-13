package com.Inheritance.mapedsuparclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Student1 extends Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int RollNo;
    @Column
    private String Name;

    @Column
    private int Mobile;

    public Student1() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Student1(String address, String schoolName, String name, int mobile) {
	super(address, schoolName);

	Name = name;
	Mobile = mobile;
    }

    public int getRollNo() {
	return RollNo;
    }

    public void setRollNo(int rollNo) {
	RollNo = rollNo;
    }

    public String getName() {
	return Name;
    }

    public void setName(String name) {
	Name = name;
    }

    public int getMobile() {
	return Mobile;
    }

    public void setMobile(int mobile) {
	Mobile = mobile;
    }

    @Override
    public String toString() {
	return "Student1 [RollNo=" + RollNo + ", Name=" + Name + ", Mobile=" + Mobile + "]";
    }

}
