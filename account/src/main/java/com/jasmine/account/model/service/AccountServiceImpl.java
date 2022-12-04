package com.jasmine.account.model.service;

import com.jasmine.account.entity.Account;
import com.jasmine.account.model.persistence.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account transferFunds(int accountId, int receipentId, double amount) {
        Account sender = accountDao.findById(accountId).orElse(null);
        Account recipient = accountDao.findById(receipentId).orElse(null);
        if(recipient!=null && sender.getBalance()>=amount) {
            accountDao.updateBalance(accountId, -amount);
            accountDao.updateBalance(receipentId, amount);
            return sender;
        }

        return null;
    }
}
