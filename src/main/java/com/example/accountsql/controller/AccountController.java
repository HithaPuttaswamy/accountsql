package com.example.accountsql.controller;

import com.example.accountsql.model.Account;
import com.example.accountsql.server.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    AccountServer accountServer;

    @GetMapping("/getaccount")
    public List<Account> getAccount(){
        return accountServer.getAccount();
    }



    @PostMapping("/createAccount")
    public void createAccounts(@Valid @RequestBody Account account){
        account.createAccounts(account);

    }
}
