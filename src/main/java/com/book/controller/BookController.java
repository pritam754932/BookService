package com.book.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.BookService;

//@Controller
@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private BookService bookService;

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET)
	 * 
	 * @ResponseBody public String getBook() { return "new and book"; }
	 */

	@GetMapping("/")
	public List<Book> booklist() {
		List<Book> book = bookService.getAllBook();
		return book;
	}

	@GetMapping("/{id}")
	public Book getId(@PathVariable("id") int id) {
		Book byId = bookService.getById(id);
		return byId;
	}

	@PostMapping("/isert")
	public Book createBook(@RequestBody Book book) {

		Book createBook = bookService.createBook(book);
		return createBook;
	}

	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") int id) {

		boolean result = bookService.delete(id);
		String output = "";
		if (result)
			output = "successfully delete";
		else
			output = "failed to delete or data not availble !!";
		return output;

	}

	@PutMapping("/")
	public Book udataBook(@RequestBody Book book) {
		Book b = bookService.update(book);
		return b;
	}

}
