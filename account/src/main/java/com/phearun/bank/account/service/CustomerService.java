package com.phearun.bank.account.service;

import com.phearun.bank.account.entity.Customer;

import java.util.List;

public interface CustomerService {

	Customer save(Customer customer);

	List<Customer> getCustomers();

	Customer getById(Long id);

}
