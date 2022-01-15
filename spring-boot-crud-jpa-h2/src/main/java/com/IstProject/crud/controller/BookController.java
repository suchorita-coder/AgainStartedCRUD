package com.IstProject.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IstProject.crud.entity.Book;
import com.IstProject.crud.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return bookService.createBook(book);
		
	}
	
	@PostMapping("/addBooks")
	public List<Book> addBooks(@RequestBody List<Book> books){
		return bookService.createBooks(books);
	}
	
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
		
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getBooks();
	}
	
	@PutMapping("/updateBook")
	public Book updateUser(@RequestBody Book book){
		return bookService.updateBook(book);
	}
	
	@DeleteMapping("/book/{id}")
	public String deleteUser(@PathVariable int id) {
		return bookService.deleteBookById(id);
	}
}
