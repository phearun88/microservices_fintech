/**
 * Author : PhearunPhin
 * Date : 2/4/2024
 */

package com.phearun.bank.card.controller;

import com.phearun.bank.card.dto.CardDTO;
import com.phearun.bank.card.entity.Card;
import com.phearun.bank.card.mapper.CardMapper;
import com.phearun.bank.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    @Autowired
    private CardService cardService;
    @Autowired
    private CardMapper cardMapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CardDTO dto){
        Card loan = cardService.save(cardMapper.toCard(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(loan);
    }

    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(cardService.getList());
    }

    @GetMapping("{cardId}")
    public ResponseEntity<?> getCards(@PathVariable Long cardId){
        return ResponseEntity.ok(cardService.getById(cardId));
    }

}
