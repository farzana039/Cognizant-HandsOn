package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepository;
	
	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void addBook(String title) {
		System.out.println("Book Service is adding the book named "+title);
		bookRepository.saveBook(title);
	}
}
