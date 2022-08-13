package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.BookDaoImpl;
import com.book.entity.Book;

@Service
public class BookService implements BookServiceInter {

	@Autowired
	private BookDaoImpl bookDaoImpl;

	@Override
	public Book createBook(Book book) {
		Book c = bookDaoImpl.createBook(book);
		return c;
	}

	@Override
	public Book update(Book book) {
		bookDaoImpl.update(book);
		
		return book;
	}

	@Override
	public boolean delete(int id) {
		boolean result = bookDaoImpl.delete(id);
		return result;
	}

	@Override
	public Book getById(int id) {
		Book byId = bookDaoImpl.getById(id);

		return byId;
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> book = bookDaoImpl.getAllBook();
		return book;
	}

}
