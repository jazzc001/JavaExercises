package org.jasmine.book.persistence;

import org.jasmine.book.entity.Book;

import java.util.Collection;

public interface BookDao {

    Collection<Book> listAllBook();
    Book serachBook(int id);

    int createBook(Book book);

    int deleteBook(int id);
}
