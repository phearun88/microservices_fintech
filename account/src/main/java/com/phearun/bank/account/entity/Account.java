package com.phearun.bank.account.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//@Document(collection = "accounts")
@Entity
@Data
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountNumber;
	//private Long customerId;

	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	private String accountType;
	private String branchAddress;
	private LocalDate createDate;

	
}
