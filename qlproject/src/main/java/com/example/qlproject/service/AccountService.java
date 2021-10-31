package com.example.qlproject.service;

import com.example.qlproject.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> finAll();
    Account findById(String accountName);
    void  delete ( String accountName);
    void  create ( Account account);

}
