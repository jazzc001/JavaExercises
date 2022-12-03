package com.jasmine.account.controller;

import com.jasmine.account.entity.Account;
import com.jasmine.account.model.service.AccountService;
import com.jasmine.account.model.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AccountController {


    @Autowired
    private LoginService loginService;

    @Autowired
    private AccountService accountService;

    //======Login Page======================
    @RequestMapping("/")
    public ModelAndView loginPageController() {
        return new ModelAndView("LoginPage");

    }

    @RequestMapping("/login")
    public ModelAndView loginController(@RequestParam("accountId")int accountId, @RequestParam("password") String password, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        Account account = loginService.loginCheck(accountId, password);
        if(account != null) {
            session.setAttribute("account", account);
            mv.setViewName("Transaction");
        } else {
            mv.addObject("message", "InvalidUser Credentials, Please try again");
            mv.setViewName("loginPage");

        }
        return mv;
    }
    @RequestMapping("/transaction")
    public ModelAndView transactionController(HttpServletRequest request, HttpSession session) {
        ModelAndView mv = new ModelAndView();

    }

    //=====================================

    //=======Menu Page=====================
    @RequestMapping("/menu")
    public ModelAndView menuPageController() {
        return new ModelAndView("menuPage");
    };

}
