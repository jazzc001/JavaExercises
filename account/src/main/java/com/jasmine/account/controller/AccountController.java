package com.jasmine.account.controller;

import com.jasmine.account.model.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/login")
    public ModelAndView loginPageController() {
        return new ModelAndView("login");
    }
}
