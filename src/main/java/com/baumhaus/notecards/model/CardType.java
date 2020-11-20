package com.baumhaus.notecards.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum CardType {

    NEED("Need"),
    OFFER("Offer"),
    MEET("Meet");

    private String type;

    CardType(String type) {
        this.type = type;
    }

    @JsonCreator
    public static CardType findByString(final String type) {
        return Stream.of(CardType.values())
                .filter(targetEnum -> targetEnum.type.equals(type))
                .findFirst()
                .orElse(null);
    }

    @JsonValue
    public String getType() {
        return type;
    }
}
