package com.phearun.bank.card.repository;

import com.phearun.bank.card.entity.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, Long> {

}
