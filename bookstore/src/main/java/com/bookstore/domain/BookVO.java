package com.bookstore.domain;

public class BookVO {
	/*
	CREATE TABLE tbl_book(
		id INT NOT NULL AUTO_INCREMENT,
		title VARCHAR(50) NOT NULL,
		author VARCHAR(30) NOT NULL,
		price DOUBLE NOT NULL,
		PRIMARY KEY(id)
	);
	*/
	
	private int id;
	private String title;
	private String author;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
