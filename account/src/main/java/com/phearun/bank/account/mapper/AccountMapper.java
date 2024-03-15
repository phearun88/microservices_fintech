/**
 * Author : PhearunPhin
 * Date : 2/2/2024
 */

package com.phearun.bank.account.mapper;

import com.phearun.bank.account.dto.AccountDTO;
import com.phearun.bank.account.dto.CustomerDTO;
import com.phearun.bank.account.entity.Account;
import com.phearun.bank.account.entity.Customer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AccountMapper {

    public Account toAccount(AccountDTO dto) {
        Account account = new Account();
        account.setAccountNumber(dto.getAccountNumber());
        account.setAccountType(dto.getAccountType());
        account.setBranchAddress(dto.getBranchAddress());
        account.setCreateDate(dto.getCreateDate());
        //account.setCustomerId(dto.getCustomerId());
        return account;
    }
}
