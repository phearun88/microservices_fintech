/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.card.service.impl;

import com.phearun.bank.card.entity.Card;
import com.phearun.bank.card.repository.CardRepository;
import com.phearun.bank.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;


    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> getCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card getById(Long id) {
        return cardRepository.findById(id).
               orElseThrow(() ->new RuntimeException("Card not found"));
    }


}
