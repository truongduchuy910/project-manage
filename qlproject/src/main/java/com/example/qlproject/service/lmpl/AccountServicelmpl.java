package com.example.qlproject.service.lmpl;

import com.example.qlproject.model.Account;
import com.example.qlproject.reporitory.AccountRepository;
import com.example.qlproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServicelmpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;


    @Override
    public List<Account> finAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(String accountName) {
        return accountRepository.findById(accountName).orElse(null);
    }

    @Override
    public void delete(String accountName) {
        this.accountRepository.deleteById(accountName);
    }

    @Override
    public void create(Account account) {
        this.accountRepository.save(account);
    }
}
