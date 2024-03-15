/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.loan.mapper;


import com.phearun.bank.loan.dto.LoanDTO;
import com.phearun.bank.loan.entity.Loan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class LoanMapper {

    public Loan toLoan(LoanDTO dto) {
        Loan loan = new Loan();
        loan.setAmountPaid(dto.getAmountPaid());
        loan.setCreateDate(dto.getCreateDate());
        loan.setCustomerId(dto.getCustomerId());
        loan.setLoanNumber(dto.getLoanNumber());
        loan.setLoanType(dto.getLoanType());
        loan.setOutstandingAmount(dto.getOutstandingAmount());
        loan.setStartDate(dto.getStartDate());
        loan.setTotalLoan(dto.getTotalLoan());
        return loan;
    }
}
