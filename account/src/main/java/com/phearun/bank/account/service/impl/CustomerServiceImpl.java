package com.phearun.bank.account.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.phearun.bank.account.entity.Customer;
import com.phearun.bank.account.repository.CustomerRepository;
import com.phearun.bank.account.service.CustomerService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
	private final CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).
				orElseThrow(() -> new RuntimeException("Customer not found"));
	}

}
