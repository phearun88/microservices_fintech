/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.card.service.impl;

import com.phearun.bank.card.entity.Card;
import com.phearun.bank.card.repository.CardRepository;
import com.phearun.bank.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;
    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }
    @Override
    public List<Card> getList() {
        return cardRepository.findAll();
    }

    @Override
    public Card getById(Long id) {
        return cardRepository.findById(id).
               orElseThrow(() ->new RuntimeException("Card not found"));
    }


}
