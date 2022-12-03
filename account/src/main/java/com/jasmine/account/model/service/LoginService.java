package com.jasmine.account.model.service;

import com.jasmine.account.entity.Account;

public interface LoginService {
    Account loginCheck(int accountId, String password);


}
