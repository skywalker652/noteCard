package com.baumhaus.notecards.service;

import com.baumhaus.notecards.controller.dto.DisplayCard;
import com.baumhaus.notecards.controller.dto.DisplayCardResponse;
import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardMapper {
    public DisplayCard map(Card card) {
        return  DisplayCard.builder()
                .firstName(card.getFirstName())
                .photoLink(card.getPhotoLink())
                .title(card.getTitle())
                .description(card.getDescription())
                .type(card.getType())
                .build();

    }

    public DisplayCardResponse map(List<Card> cards) {
       List<DisplayCard> displayCards =  cards.stream().map(it -> map(it)).collect(Collectors.toList());
       return DisplayCardResponse.builder()
               .displayCards(displayCards)
               .build();
    }

}
