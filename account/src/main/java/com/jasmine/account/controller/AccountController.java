package com.jasmine.account.controller;

import com.jasmine.account.entity.Account;
import com.jasmine.account.model.service.AccountService;
import com.jasmine.account.model.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private LoginService loginService;

    //======Login Page======================
    @RequestMapping("/")
    public ModelAndView loginPageController() {
        return new ModelAndView("LoginPage");

    }

    @RequestMapping("/login")
    public ModelAndView loginController(HttpServletRequest request, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        int accountId = Integer.parseInt(request.getParameter("accountId"));
        String password = request.getParameter("password");
        Account account = loginService.loginCheck(accountId, password);
        if(account != null) {


            session.setAttribute("account", account);
            mv.setViewName("menuPage");
        } else {
            mv.addObject("message", "InvalidUser Credentials, Please try again");
            mv.setViewName("loginPage");

        }
        return mv;
    }
    //=====================================

    //=======Menu Page=====================
    @RequestMapping("/menu")
    public ModelAndView menuPageController() {
        return new ModelAndView("menuPage");
    };

}
