package com.library.service;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Add a new book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Get book by ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Delete book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
