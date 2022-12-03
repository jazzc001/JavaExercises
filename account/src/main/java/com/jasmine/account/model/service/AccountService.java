package com.jasmine.account.model.service;

import com.jasmine.account.entity.Account;

public interface AccountService {

    public boolean findById(int accountId, int receipentId, double amount);
}
