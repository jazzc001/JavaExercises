package com.jasmine.bookspringrestapi.service;


import com.jasmine.bookspringrestapi.entity.Book;
import com.jasmine.bookspringrestapi.persistence.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;


    public BookServiceImpl(BookDao bookDao) {
        super();
        this.bookDao = bookDao;
    }

    @Override
    public Collection<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @Override
    public Book searchBookById(int id) {
        return bookDao.findById(id).orElse(null);
    }

    @Override
    public boolean addBook(Book book) {
        if(searchBookById(book.getBookId()) == null) {
            bookDao.save(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(int id) {
        if(searchBookById(id) != null){
            bookDao.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Collection<Book> findCopiesGreaterThan(int copies) {



        return bookDao.findByNoOfCopiesGreaterThan(copies);

    }

    @Override
    public Integer findAuthorListNumber(String name) {

        return bookDao.countDistinctByAuthorName(name);
    }
}
