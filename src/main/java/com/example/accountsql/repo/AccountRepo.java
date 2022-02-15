package com.example.accountsql.repo;

import com.example.accountsql.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo  extends JpaRepository <Account,Integer>{

}