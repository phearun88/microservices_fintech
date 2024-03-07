/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.card.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CardDTO {
    private Long cardId;
    private Long customerId;
    private String cartType;
    private int totalLimit;
    private int availableAmount;
    private String createDate;
}
