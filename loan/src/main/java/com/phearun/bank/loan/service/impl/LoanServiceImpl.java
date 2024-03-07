/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.loan.service.impl;


import com.phearun.bank.loan.entity.Loan;
import com.phearun.bank.loan.repository.LoanRepository;
import com.phearun.bank.loan.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;

    @Override
    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> getLoans() {
        return loanRepository.findAll();
    }

    @Override
    public Loan getById(Long id) {
        return loanRepository.findById(id).
                orElseThrow(() ->new RuntimeException("Customer not found"));
    }


}
