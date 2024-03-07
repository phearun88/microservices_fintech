package com.phearun.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.phearun.bank.account.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	

}
