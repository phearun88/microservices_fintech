package com.phearun.bank.card.service;

import com.phearun.bank.card.entity.Card;

import java.util.List;

public interface CardService {
    Card save(Card card);


    List<Card> getCards();

    Card getById(Long id);
}
