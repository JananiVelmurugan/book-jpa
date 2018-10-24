package com.fujitsu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fujitsu.demo.dao.BookRepository;
import com.fujitsu.demo.model.Book;

@Controller
public class BookController {
	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/list")
	public List<Book> findAll() {
		return bookRepository.findAll();

	}
}
