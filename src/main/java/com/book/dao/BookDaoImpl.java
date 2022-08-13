package com.book.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.book.BookRowMapper;
import com.book.entity.Book;

@Repository
public class BookDaoImpl implements BookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Book createBook(Book book) {
		String q = "insert into employee.book(bookid,author_name,title,price)values(?,?,?,?)";
		jdbcTemplate.update(q, book.getBookid(), book.getAuthor_name(), book.getTitle(), book.getPrice());
		return book;
	}

	@Override
	public Book update(Book book) {
		String q = "update employee.book set author_name=?,title=?,price=? where bookid=?";
		jdbcTemplate.update(q, book.getAuthor_name(), book.getTitle(), book.getPrice(), book.getBookid());
		return book;
	}

	@Override
	public boolean delete(int id) {
		String q = "delete from employee.book where bookid=?";
		int result = jdbcTemplate.update(q, id);
		return result > 0 ? true : false;
	}

	@Override
	public Book getById(int id) {
		RowMapper<Book> row = new BookRowMapper();
		Book b = jdbcTemplate.queryForObject("select * from  employee.book where bookid=?", row, id);
		return b;
	}

	@Override
	public List<Book> getAllBook() {
		List<Book> result = jdbcTemplate.query("select * from employee.book", new BookRowMapper());
		return result;
	}

}
