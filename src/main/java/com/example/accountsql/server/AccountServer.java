package com.example.accountsql.server;

import com.example.accountsql.model.Account;
import com.example.accountsql.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServer {
    @Autowired
    AccountRepo accountRepo;
    public void createAccounts(Account account){
        accountRepo.save(new Account(account.getAccountName(), account.getBankName()));
    }

    public List<Account> getAccount() {
        return accountRepo.findAll();
    }
}