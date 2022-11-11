package org.jasmine.book.service;

import org.jasmine.book.entity.Book;
import org.jasmine.book.persistence.BookDao;
import org.jasmine.book.persistence.BookDaoImpl;

import java.util.Collection;

public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        super();
        this.bookDao = bookDao;
    }

    @Override
    public Collection<Book> getAllBooks() {
        return bookDao.listAllBook();
    }

    @Override
    public Book searchBookById(int id) {
        return bookDao.serachBook(id);
    }

    @Override
    public boolean addBook(Book book) {
        Book b = bookDao.serachBook(book.getBookId());
        if(b != null) {
            return false;
        }
        bookDao.createBook(book);
        return true;
    }
}
