package com.jasmine.bookspringrestapi.resource;


import com.jasmine.bookspringrestapi.entity.Book;
import com.jasmine.bookspringrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BookResource {

    @Autowired
    BookService bookService;

    @RequestMapping(path = "/books", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Book> getAllEmployeesResource() {
        return bookService.getAllBooks();

    }
}
