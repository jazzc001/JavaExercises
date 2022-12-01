package com.jasmine.springweb.controller;

import com.jasmine.springweb.model.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//Controller is used to mark any class as controller
@Controller
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    //Mapping Handler
    @RequestMapping("/first")
    //all controller methods mush be public
    public ModelAndView myFirstController() {
        ModelAndView modelAndView = new ModelAndView();
        String greetMessage = welcomeService.welcome();

        //Setting data for viewing on view
        modelAndView.addObject("message", greetMessage);

        //Setting view name with is supposed to display output to the client
        modelAndView.setViewName("Greet");

        return modelAndView;

    }


}
