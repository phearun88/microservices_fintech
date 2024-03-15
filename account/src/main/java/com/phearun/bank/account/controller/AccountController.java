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
    private AccountService AccountService;
    @Autowired
    private AccountMapper AccountMapper;

    @PostMapping
    public ResponseEntity<?> saveAccount(@RequestBody AccountDTO dto){
        Account Account = AccountMapper.toAccount(dto);
        Account = AccountService.save(Account);
        return ResponseEntity.ok(Account);
    }

    @GetMapping
    public ResponseEntity<?> getAccounts(){
        return ResponseEntity.ok(AccountService.getAccounts());
    }

    @GetMapping("{accountId}")
    public ResponseEntity<?> getAccounts(@PathVariable Long accountId){
        return ResponseEntity.ok(AccountService.getById(accountId));
    }
}
