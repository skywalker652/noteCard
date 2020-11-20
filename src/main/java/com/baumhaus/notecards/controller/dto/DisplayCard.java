package com.baumhaus.notecards.controller.dto;

import com.baumhaus.notecards.model.CardType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

/*
 * Card information displayed when looking through cards
 */
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class DisplayCard {
    String firstName;
    String photoLink;
    String title;
    String description;
    CardType type;

}
