package com.jasmine.account.controller;

import com.jasmine.account.entity.Account;
import com.jasmine.account.model.service.AccountService;
import com.jasmine.account.model.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private LoginService loginService;

    //======Login Page======================
    @RequestMapping("/")
    public ModelAndView loginPageController() {
        return new ModelAndView("LoginPage", "account", new Account());

    }

    @RequestMapping("/login")
    public ModelAndView loginController() {
        ModelAndView mv = new ModelAndView("loginPage");
        return mv;
    }
    //=====================================

    //=======Menu Page=====================
    @RequestMapping("/menu")
    public ModelAndView menuPageController() {
        return new ModelAndView("menuPage");
    };

}
