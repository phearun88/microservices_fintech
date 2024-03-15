package com.phearun.bank.account.service;

import com.phearun.bank.account.entity.Account;

import java.util.List;

public interface AccountService {
	Account save(Account Account);

	List<Account> getAccounts();

	Account getById(Long id);

}
