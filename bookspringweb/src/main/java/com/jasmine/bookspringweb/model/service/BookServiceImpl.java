package com.jasmine.bookspringweb.model.service;

import com.jasmine.bookspringweb.entity.Book;
import com.jasmine.bookspringweb.model.persistence.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
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
        try{
            bookDao.insertBook(book.getBookId(), book.getBookName(), book.getAuthorName(),
                    book.getNoOfCopies(), book.getDateOfPublishing());
            return true;
        } catch (SQLIntegrityConstraintViolationException e) {
            return false;
        } catch(Exception ex) {
            return false;
        }
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
