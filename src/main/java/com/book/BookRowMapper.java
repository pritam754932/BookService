package com.book;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.book.entity.Book;

public class BookRowMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book=new Book();
		book.setBookid(rs.getInt(1));
		book.setAuthor_name(rs.getString(2));
		book.setTitle(rs.getString(3));
		book.setPrice(rs.getInt(4));
		
		return book ;
	}

}
