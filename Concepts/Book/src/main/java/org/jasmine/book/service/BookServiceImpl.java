package org.jasmine.book.service;

import org.jasmine.book.entity.Book;
import org.jasmine.book.persistence.BookDao;
import org.jasmine.book.persistence.BookDaoImpl;

public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        super();
        this.bookDao = bookDao;
    }

    @Override
    public Book searchBookById(int id) {
        return bookDao.serachBook(id);
    }
}
