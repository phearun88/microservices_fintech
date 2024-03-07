/**
 * Author : PhearunPhin
 * Date : 2/2/2024
 */

package com.phearun.bank.account.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerDTO {
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private String createDate;
}
