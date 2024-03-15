package com.phearun.bank.card.service;

import com.phearun.bank.card.entity.Card;

import java.util.List;

public interface CardService {
    Card save(Card card);


    List<Card> getList();

    Card getById(Long id);


}
