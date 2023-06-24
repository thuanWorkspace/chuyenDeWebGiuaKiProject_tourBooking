package com.excercise.lab7.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.lab7.entity.Book;
import com.excercise.lab7.repos.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public BookService() {
		// TODO Auto-generated constructor stub

	}

	public List<Book> list() {
		return bookRepository.findAll();
	}
	public Book findbyid(long id) {
		return bookRepository.findById(id).get();
	}
	
}
