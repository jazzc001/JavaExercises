package org.jasmine.book.service;

import org.jasmine.book.entity.Book;

import java.util.Collection;

public interface BookService {

    Collection<Book> getAllBooks();

    Book searchBookById(int id);
}
