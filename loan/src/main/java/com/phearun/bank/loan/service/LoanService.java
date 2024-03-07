package com.phearun.bank.loan.service;


import com.phearun.bank.loan.entity.Loan;

import java.util.List;

public interface LoanService {
    Loan save(Loan loan);


    List<Loan> getLoans();

    Loan getById(Long id);
}
