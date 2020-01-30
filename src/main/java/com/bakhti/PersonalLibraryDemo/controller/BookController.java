package com.bakhti.PersonalLibraryDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bakhti.PersonalLibraryDemo.entity.Book;
import com.bakhti.PersonalLibraryDemo.repository.BookRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/books")
	public List<Book> listBooks() {
		return (List<Book>) bookRepository.findAll();
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {
		bookRepository.save(book);
	}

}
