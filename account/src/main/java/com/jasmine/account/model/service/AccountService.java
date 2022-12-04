package com.jasmine.account.model.service;

import com.jasmine.account.entity.Account;

public interface AccountService {

    public Account transferFunds(int accountId, int receipentId, double amount);
}
