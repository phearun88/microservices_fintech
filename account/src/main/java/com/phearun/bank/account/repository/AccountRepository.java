package com.phearun.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.phearun.bank.account.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
