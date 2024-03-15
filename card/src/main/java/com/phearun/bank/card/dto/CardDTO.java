/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.card.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CardDTO {
    private Long cardId;
    private Long customerId;
    private String cardNumber;
    private String cardType;
    private BigDecimal totalLimit;
    private BigDecimal amountUsed;
    private BigDecimal availableAmount;
    private LocalDate createDate;
}
