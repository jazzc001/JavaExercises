package org.jasmine.book.persistence;

import org.jasmine.book.database.BookDatabase;
import org.jasmine.book.entity.Book;

import java.util.Collection;

public class BookDaoImpl implements BookDao{

    public BookDaoImpl() {
    }

    @Override
    public Collection<Book> listAllBook() {
        return BookDatabase.getBookList().values();
    }

    @Override
    public Book serachBook(int id) {

        return BookDatabase.getBookList().get(id);
    }

    @Override
    public Book createBook(Book book) {
        return BookDatabase.getBookList().put(book.getBookId(), book);
    }
}
