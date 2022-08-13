package com.book.service;

import java.util.List;

import com.book.entity.Book;

public interface BookServiceInter {
	
	public Book createBook(Book book);
	public Book update(Book book);
	public boolean delete(int id);
	public Book getById(int id);
	public List<Book> getAllBook();

}
