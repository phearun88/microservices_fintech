/**
 * Author : PhearunPhin
 * Date : 2/2/2024
 */

package com.phearun.bank.account.controller;

import com.phearun.bank.account.dto.AccountDTO;
import com.phearun.bank.account.entity.Account;
import com.phearun.bank.account.mapper.AccountMapper;
import com.phearun.bank.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;

    @PostMapping
    public ResponseEntity<?> saveAccount(@RequestBody AccountDTO accountDTO){
        Account account = accountMapper.toAccount(accountDTO);

        account = accountService.save(account);

        return ResponseEntity.ok(account);
    }

    @GetMapping
    public ResponseEntity<?> getAccounts(){
        return ResponseEntity.ok(accountService.getAccounts());
    }

    @GetMapping("{accountId}")
    public ResponseEntity<?> getSAccounts(@PathVariable Long accountId){
        return ResponseEntity.ok(accountService.getById(accountId));
    }
}
