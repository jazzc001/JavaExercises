package com.jasmine.springboot.book.persistence;

import com.jasmine.springboot.book.entity.Book;

import java.util.Collection;

public interface BookDao {
    Collection<Book> listAllBook();
    Book serachBook(int id);

    int createBook(Book book);

    int deleteBook(int id);
}
