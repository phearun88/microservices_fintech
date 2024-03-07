/**
 * Author : PhearunPhin
 * Date : 2/3/2024
 */

package com.phearun.bank.card.mapper;

import com.phearun.bank.card.dto.CardDTO;
import com.phearun.bank.card.entity.Card;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CardMapper {

    public Card toCard(CardDTO cardDTO){
        Card card = new Card();
        card.setAvailableAmount(cardDTO.getAvailableAmount());
        card.setCartType(cardDTO.getCartType());
        card.setTotalLimit(cardDTO.getTotalLimit());
        card.setCustomerId(cardDTO.getCustomerId());
        card.setCreateDate(LocalDate.parse(cardDTO.getCreateDate()));

        return card;
    }
}
