package com.phearun.bank.loan.repository;


import com.phearun.bank.loan.entity.Loan;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan, Long> {
}
