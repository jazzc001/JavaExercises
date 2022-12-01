package com.jasmine.bookspringweb.controller;


import com.jasmine.bookspringweb.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    public ModelAndView menuPageController() {
        return new ModelAndView("index");
    }
}
