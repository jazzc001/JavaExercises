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
            mv.setViewName("MenuPage");
        } else {
            mv.addObject("message", "InvalidUser Credentials, Please try again");
            mv.setViewName("LoginPage");

        }
        return mv;

    }
    //===============TransactionPage===========================
    @RequestMapping("/transactionPage")
    public ModelAndView transactionPage(){
        return new ModelAndView("Transaction");
    }
    @RequestMapping("/transaction")
    public ModelAndView transactionController(@RequestParam("accountId") int recepientAccountId,@RequestParam("balance") double amount, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        int senderId = ((Account)session.getAttribute("account")).getAccountId();
        Account sender = this.accountService.transferFunds(senderId, recepientAccountId, amount);
        if(sender == null){
            mv.addObject("message", "Transaction Failed");
            session.setAttribute("account", sender);
        } else {
            mv.addObject("message", "Your have sent £" + amount+" to " + recepientAccountId + "" +
                    " and your current balance is £"+ sender.getBalance());
        }

        mv.setViewName("Output");
        return mv;
    }

    //=====================================

    //=======Menu Page=====================
    @RequestMapping("/menu")
    public ModelAndView menuPageController() {
        return new ModelAndView("MenuPage");
    };

}
