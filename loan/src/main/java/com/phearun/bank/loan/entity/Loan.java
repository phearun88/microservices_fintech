/**
 * Author : PhearunPhin
 * Date : 2/2/2024
 */

package com.phearun.bank.loan.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

//@Entity
@Document(collation = "loans")
@Data
public class Loan {
  private Long loanNumber;
  private Long customerId;
  private LocalDate startDate;
  private String loanType;
  private BigDecimal totalLoan;
  private BigDecimal amountPaid;
  private BigDecimal outstandingAmount;
  private LocalDate createDate;
}
