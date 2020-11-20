package com.baumhaus.notecards.builder;

import com.baumhaus.notecards.controller.dto.DisplayCard;
import com.baumhaus.notecards.controller.dto.DisplayCardResponse;
import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DisplayCardResponseBuilder {

    private List<DisplayCard> displayCards = Arrays.asList(DisplayCardBuilder.aDisplayCard().build());




    public DisplayCardResponse build() {
        return DisplayCardResponse.builder()
                .displayCards(displayCards)
                .build();
    }

    public DisplayCardResponseBuilder addDisplayCard(DisplayCard displayCard) {
        this.displayCards.add(displayCard);
        return this;
    }

    public static DisplayCardResponseBuilder aDisplayCardResponse() { return new DisplayCardResponseBuilder();}
}
