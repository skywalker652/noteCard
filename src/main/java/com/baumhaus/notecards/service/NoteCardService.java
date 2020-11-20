package com.baumhaus.notecards.service;

import com.baumhaus.notecards.controller.dto.DisplayCard;
import com.baumhaus.notecards.controller.dto.DisplayCardResponse;
import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;
import com.baumhaus.notecards.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;

@Service
public class NoteCardService {

    @Autowired
    CardMapper cardMapper;

    @Autowired
    CardRepository cardRepository;

    public DisplayCardResponse fetchCard(Integer offset, CardType cardType) {
       return cardMapper.map(cardRepository.findByType(cardType));
    }
}
