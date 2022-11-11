package org.jasmine.book.persistence;

import org.jasmine.book.entity.Book;

import java.util.Collection;

public interface BookDao {

    Collection<Book> listAllBook();
    Book serachBook(int id);

    Book createBook(Book book);
}
