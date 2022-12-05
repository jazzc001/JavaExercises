package com.jasmine.bookspringrestapi.resource;


import com.jasmine.bookspringrestapi.entity.Book;
import com.jasmine.bookspringrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class BookResource {

    @Autowired
    BookService bookService;

    @RequestMapping(path = "/books", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Book> getAllEmployeesResource() {
        return bookService.getAllBooks();

    }

    @RequestMapping(path = "/books/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book searchBookByIdResource(@PathVariable("id") int id) {
        return bookService.searchBookById(id);
    }

    @RequestMapping(path = "/books", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addBookResource(@RequestBody Book book) {

        String result = bookService.addBook(book) ? "Record added" : "Record not added";
        return result;
    }

    @RequestMapping(path = "/books/{id}", method = RequestMethod.DELETE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String deleteBookResource(@PathVariable("id") int id) {
        String result = bookService.deleteBook(id)? "Record deleted" : "Record not deleted";
        return result;
    }


}
