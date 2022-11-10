package org.jasmine.book.database;

import org.jasmine.book.entity.Book;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookDatabase {
    public static Map<Integer, Book> bookList = new LinkedHashMap<Integer, Book>();

    static{
        bookList.put(101, new Book(101, "Look", "Peter", 23));
        bookList.put(102, new Book(102, "Smell", "Alice", 34));
        bookList.put(103, new Book(103, "Hey", "Tracey", 12));
        bookList.put(104, new Book(104, "They", "Emily", 78));
        bookList.put(105, new Book(105, "You", "Lily", 1));
    }

    public static Map<Integer, Book> getBookList() {
        return bookList;
    }
}
