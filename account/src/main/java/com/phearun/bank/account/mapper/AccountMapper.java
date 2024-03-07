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

    public Account toAccount(AccountDTO accountDTO){
        Account account = new Account();
        account.setAccountNumber(accountDTO.getAccountNumber());
        //account.setCustomerId(accountDTO.getCustomerId());
        account.setAccountType(accountDTO.getAccountType());
        account.setBranchAddress(accountDTO.getBranchAddress());
        account.setCreateDate(LocalDate.parse(accountDTO.getCreateDate()));


        return account ;


//        private Long accountNumber;
//        private Long AccountId;
//        private String accountType;
//        private String branchAddress;
//        private LocalDate createDate;

    }
}
