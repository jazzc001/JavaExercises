package org.jasmine.book.persistence;

import org.jasmine.book.database.BookDatabase;
import org.jasmine.book.entity.Book;

public class BookDaoImpl implements BookDao{

    public BookDaoImpl() {
    }

    @Override
    public Book serachBook(int id) {

        return BookDatabase.getBookList().get(id);
    }
}
