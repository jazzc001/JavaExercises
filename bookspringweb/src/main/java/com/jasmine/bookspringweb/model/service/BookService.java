package com.jasmine.bookspringweb.model.service;

import com.jasmine.bookspringweb.entity.Book;

import java.util.Collection;

public interface BookService {
    Collection<Book> getAllBooks();

    Book searchBookById(int id);

    boolean addBook(Book book);

    boolean deleteBook(int id);


    Collection<Book> findCopiesGreaterThan(int copies);

    Integer findAuthorListNumber(String name);
}
