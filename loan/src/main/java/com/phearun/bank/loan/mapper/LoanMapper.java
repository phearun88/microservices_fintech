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

    public Loan toLoan(LoanDTO loanDTO){
        Loan loan = new Loan();
        loan.setAmountPaid(loanDTO.getAmountPaid());
        loan.setCreateDate(loanDTO.getCreateDate());
        loan.setCustomerId(loanDTO.getCustomerId());
        loan.setLoanNumber(loanDTO.getLoanNumber());
        loan.setLoanType(loanDTO.getLoanType());
        loan.setOutstandingAmount(loanDTO.getOutstandingAmount());
        loan.setStartDate(loanDTO.getStartDate());
        loan.setTotalLoan(loanDTO.getTotalLoan());





        return loan;
    }
}
