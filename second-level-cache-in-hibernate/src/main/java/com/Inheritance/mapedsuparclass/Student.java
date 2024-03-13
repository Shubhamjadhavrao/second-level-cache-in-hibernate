package com.Inheritance.mapedsuparclass;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Student {
    @Column
    private String Address;
    @Column
    private String SchoolName;

    public Student() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Student(String address, String schoolName) {
	super();
	Address = address;
	SchoolName = schoolName;
    }

    public String getAddress() {
	return Address;
    }

    public void setAddress(String address) {
	Address = address;
    }

    public String getSchoolName() {
	return SchoolName;
    }

    public void setSchoolName(String schoolName) {
	SchoolName = schoolName;
    }

    @Override
    public String toString() {
	return "Student [Address=" + Address + ", SchoolName=" + SchoolName + "]";
    }

}
