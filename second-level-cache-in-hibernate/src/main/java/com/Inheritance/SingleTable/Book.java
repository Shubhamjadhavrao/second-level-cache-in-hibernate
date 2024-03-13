package com.Inheritance.SingleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("My_Book")
public class Book extends Product {
    @Column
    private String Author;
    @Column
    private int ISBN;

    public Book() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Book(String name, String author, int iSBN) {
	super(name);
	Author = author;
	ISBN = iSBN;
    }

    public String getAuthor() {
	return Author;
    }

    public void setAuthor(String author) {
	Author = author;
    }

    public int getISBN() {
	return ISBN;
    }

    public void setISBN(int iSBN) {
	ISBN = iSBN;
    }

    @Override
    public String toString() {
	return "Book [Author=" + Author + ", ISBN=" + ISBN + "]";
    }

}
