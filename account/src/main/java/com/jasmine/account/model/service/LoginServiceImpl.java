package com.jasmine.account.model.service;

import com.jasmine.account.entity.Account;
import com.jasmine.account.model.persistence.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private AccountDao accountDao;
    @Override
    public Account loginCheck(int accountId, String password) {

        try {
            Account acc = accountDao.findByAccountIdAndPassword(accountId, password);
            return acc;
        }
        catch (Exception e) {
            return null;
        }


    }

    @Override
    public Account searchById(int accountId) {
        return accountDao.findById(accountId).orElse(null);
    }
}
