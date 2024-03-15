package com.phearun.bank.card.mapper;

import com.phearun.bank.card.dto.CardDTO;
import com.phearun.bank.card.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

    Card toCard(CardDTO dto);
}
