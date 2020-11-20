package com.baumhaus.notecards.builder;

import com.baumhaus.notecards.controller.dto.DisplayCard;
import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;

public class DisplayCardBuilder {

    private String firstName = "Bob";
    private String photoLink = "www.photo.com";
    private String title = "Coffee";
    private String description = "I need five kg of coffee";
    private CardType cardType = CardType.NEED;



    public DisplayCard build() {
        return DisplayCard.builder()
                .firstName(firstName)
                .photoLink(photoLink)
                .title(title)
                .description(description)
                .type(cardType)
                .build();
    }

    public DisplayCardBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public DisplayCardBuilder withPhotoLink(String photoLink) {
        this.photoLink = photoLink;
        return this;
    }

    public DisplayCardBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public DisplayCardBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public DisplayCardBuilder withCardType(CardType cardType) {
        this.cardType = cardType;
        return this;
    }



    public static DisplayCardBuilder aDisplayCard() { return new DisplayCardBuilder();}
}
