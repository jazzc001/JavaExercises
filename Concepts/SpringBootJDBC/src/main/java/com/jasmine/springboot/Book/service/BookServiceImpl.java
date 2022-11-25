package com.jasmine.springboot.book.service;

import com.jasmine.springboot.book.entity.Book;
import com.jasmine.springboot.book.persistence.BookDao;
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
        return bookDao.listAllBook();
    }

    @Override
    public Book searchBookById(int id) {
        return bookDao.serachBook(id);
    }

    @Override
    public boolean addBook(Book book) {
        if(bookDao.createBook(book) > 0)
            return true;
        return false;
    }

    @Override
    public boolean deleteBook(int id) {
        if(bookDao.deleteBook(id)>0){
            return true;
        }
        return false;
    }
}
