/**
 * Author : PhearunPhin
 * Date : 2/2/2024
 */

package com.phearun.bank.account.mapper;

import com.phearun.bank.account.dto.CustomerDTO;
import com.phearun.bank.account.entity.Customer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CustomerMapper {

    public Customer toCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        customer.setCreateDate(LocalDate.parse(customerDTO.getCreateDate()));

        return customer;
    }
}
