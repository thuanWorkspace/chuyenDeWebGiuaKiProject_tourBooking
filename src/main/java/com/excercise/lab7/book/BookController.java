package com.excercise.lab7.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.excercise.lab7.entity.Book;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/book")
	public @ResponseBody boolean checkequalBook() {
		List<Book> books = bookService.list();

		return books.size() == 3;
	}

	@GetMapping("/book/{id}")
	public @ResponseBody Book checkequalBook(@PathVariable long id) {
		Book book = bookService.findbyid(id);

		return book;
	}
}
