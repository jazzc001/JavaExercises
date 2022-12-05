package com.jasmine.bookspringweb.controller;


import com.jasmine.bookspringweb.entity.Book;
import com.jasmine.bookspringweb.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Collection;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //===========Menu Page========================
    @RequestMapping("/index")
    public ModelAndView menuPageController() {
        return new ModelAndView("Index");
    }

    //==========List All Books=======
    @RequestMapping("/listAll")
    public ModelAndView listAllBooksPage() {
        ModelAndView modelAndView = new ModelAndView();
        Collection<Book> bookList = bookService.getAllBooks();

        modelAndView.addObject("books", bookList);
        modelAndView.setViewName("ListAllBooks");

        return modelAndView;
    }

    //========Search Book by ID======

    @RequestMapping("/searchBookByIdPage")
    public ModelAndView searchBookPage() {
        return new ModelAndView("InputForSearchBookById");
    }

    @RequestMapping("/searchBookById")
    public ModelAndView searchBookByIdController(@RequestParam("bookId")int id) {
        ModelAndView modelAndView = new ModelAndView();
        Book book = bookService.searchBookById(id);
        if(book !=null) {
            modelAndView.addObject("book", book);
            modelAndView.setViewName("ShowBook");
        }else {
            modelAndView.addObject("message", "Book with ID: "+id+" does not exist.");
            modelAndView.setViewName("Output");
        }

        return modelAndView;
    }

    //=====Add new Book
    @RequestMapping("/addNewBookPage")
    public ModelAndView addNewBookPage() {
        return new ModelAndView("InputForNewBook", "book", new Book());
    }

    @RequestMapping("/addNewBook")
    public ModelAndView addNewBookController(@ModelAttribute("book")Book book,
                                             @RequestParam("dateOfPublishing") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
            ModelAndView modelAndView = new ModelAndView();
            String message = null;

            book.setDateOfPublishing(date);

            if(bookService.addBook(book))
                message = "Book added with ID " + book.getBookId();
            else
                message = "Book with ID " + book.getBookId() + " already exists";

            modelAndView.addObject("message", message);
            modelAndView.setViewName("Output");

            return modelAndView;
    }
}
