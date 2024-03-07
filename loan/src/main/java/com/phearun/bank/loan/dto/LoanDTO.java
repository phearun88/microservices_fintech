/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.loan.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class LoanDTO {

    private Long loanNumber;
    private Long customerId;
    private LocalDate startDate;
    private String loanType;
    private BigDecimal totalLoan;
    private BigDecimal amountPaid;
    private BigDecimal outstandingAmount;
    private LocalDate createDate;
}
