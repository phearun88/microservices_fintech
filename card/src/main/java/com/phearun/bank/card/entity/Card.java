/**
 * Author : PhearunPhin
 * Date : 2/2/2024
 */

package com.phearun.bank.card.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;
    private Long customerId;
    private String cartType;
    private int totalLimit;
    private int availableAmount;
    private LocalDate createDate;
}
