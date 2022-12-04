package com.jasmine.bookspringweb.controller;


import com.jasmine.bookspringweb.entity.Book;
import com.jasmine.bookspringweb.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //===========Menu Page========================
    @RequestMapping("/index")
    public ModelAndView menuPageController() {
        return new ModelAndView("index");
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
}
