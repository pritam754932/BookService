package com.book.entity;

public class Book {
	private int bookid;
	private String author_name;
	private String title;
	private int price;
	
	
	public Book(int bookid, String author_name, String title, int price) {
		super();
		this.bookid = bookid;
		this.author_name = author_name;
		this.title = title;
		this.price = price;
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getAuthor_name() {
		return author_name;
	}


	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", author_name=" + author_name + ", title=" + title + ", price=" + price
				+ "]";
	}
	
	

}
