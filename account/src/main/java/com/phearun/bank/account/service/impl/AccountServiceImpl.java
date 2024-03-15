package com.phearun.bank.account.service.impl;


import com.phearun.bank.account.entity.Account;
import com.phearun.bank.account.repository.AccountRepository;
import com.phearun.bank.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
	private final AccountRepository AccountRepository;

	@Override
	public Account save(Account Account) {
		return AccountRepository.save(Account);
	}

	@Override
	public List<Account> getAccounts() {
		return AccountRepository.findAll();
	}

	@Override
	public Account getById(Long id) {
		return AccountRepository.findById(id).
				orElseThrow(() -> new RuntimeException("Account not found"));
	}

}
