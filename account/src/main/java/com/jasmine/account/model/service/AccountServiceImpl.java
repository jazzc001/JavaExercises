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
    public boolean findById(int accountId, int receipentId, double amount) {
        Account sender = accountDao.findById(accountId).orElse(null);
        Account receipient = accountDao.findById(receipentId).orElse(null);
        if(receipient!=null && sender.getBalance()>=amount) {
            accountDao.updateBalance(accountId, amount);
            accountDao.updateBalance(receipentId, -amount);
            return true;
        }

        return false;
    }
}
