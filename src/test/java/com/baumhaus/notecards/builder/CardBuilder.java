package com.baumhaus.notecards.builder;

import com.baumhaus.notecards.controller.dto.DisplayCard;
import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;


public class CardBuilder {

    private long userId = 5L;
    private String firstName = "Bob";
    private String photoLink = "www.photo.com";
    private String title = "Coffee";
    private String description = "I need five kg of coffee";
    private CardType cardType = CardType.NEED;



    public Card build() {
        return Card.builder()
                .userId(userId)
                .firstName(firstName)
                .photoLink(photoLink)
                .title(title)
                .description(description)
                .type(cardType)
                .build();
    }

    public CardBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CardBuilder withPhotoLink(String photoLink) {
        this.photoLink = photoLink;
        return this;
    }

    public CardBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public CardBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public CardBuilder withCardType(CardType cardType) {
        this.cardType = cardType;
        return this;
    }

    public CardBuilder withUserId(Long userId) {
        this.userId = userId;
        return this;
    }


    public static CardBuilder aCard() { return new CardBuilder();}
}
