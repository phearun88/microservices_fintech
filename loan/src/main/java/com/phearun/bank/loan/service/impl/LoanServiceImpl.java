/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.loan.service.impl;


import com.phearun.bank.loan.entity.Loan;
import com.phearun.bank.loan.repository.LoanRepository;
import com.phearun.bank.loan.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;
    @Override
    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }
    @Override
    public List<Loan> getList() {
        return loanRepository.findAll();
    }

    @Override
    public Loan getById(Long id) {
        return loanRepository.findById(id).
                orElseThrow(() ->new RuntimeException("Customer not found"));
    }


}
