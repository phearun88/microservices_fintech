/**
 * Author : PhearunPhin
 * Date : 2/4/2024
 */

package com.phearun.bank.account.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AccountDTO {
    private Long accountNumber;
    private Long customerId;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
}
