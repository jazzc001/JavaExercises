package com.jasmine.account.model.persistence;

import com.jasmine.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;

@Repository
public interface AccountDao extends JpaRepository<Account, Integer> {

    public Account findUserByAccountIdAndPassword(int accountId, String password);

    @Modifying
    @Transactional
    @Query("update Account set balance=balance+:amt where accountId=:id")
    int updateBalance(@Param("id") int accountId, @Param("amt") double balance);

}
