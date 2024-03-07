/**
 * Author : PhearunPhin
 * Date : 2/4/2024
 */

package com.phearun.bank.loan.controller;


import com.phearun.bank.loan.dto.LoanDTO;
import com.phearun.bank.loan.entity.Loan;
import com.phearun.bank.loan.mapper.LoanMapper;
import com.phearun.bank.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;
    @Autowired
    private LoanMapper loanMapper;

    @PostMapping
    public ResponseEntity<?> saveLoan(@RequestBody LoanDTO loanDTO){
      //  Loan loan = loanMapper.toLoan(loanDTO);

        Loan loan = loanService.save(loanMapper.toLoan(loanDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(loan);

       // loan = loanService.save(loan);

      //  return ResponseEntity.ok(loan);

    }


    @GetMapping
    public ResponseEntity<?> getLoans(){
        return ResponseEntity.ok(loanService.getLoans());
    }

    @GetMapping("{loanId}")
    public ResponseEntity<?> getCards(@PathVariable Long loanId){
        return ResponseEntity.ok(loanService.getById(loanId));
    }
}
