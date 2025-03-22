package com.workintech.s19d2.service;

import com.workintech.s19d2.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
    void delete(Long id);
    Account findById(Long id);
    Account update(Long id, Account account);
}
