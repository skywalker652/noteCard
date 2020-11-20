package com.baumhaus.notecards.service;

import com.baumhaus.notecards.builder.CardBuilder;
import com.baumhaus.notecards.builder.DisplayCardResponseBuilder;
import com.baumhaus.notecards.controller.dto.DisplayCard;
import com.baumhaus.notecards.controller.dto.DisplayCardResponse;
import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;
import com.baumhaus.notecards.repository.CardRepository;
import org.junit.Rule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import  org.mockito.junit.MockitoJUnitRunner;

import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class NoteCardServiceTest {

        @Mock
        private CardRepository repository;


        @Spy
        private CardMapper mapper;

        @InjectMocks
        private NoteCardService service;



        @Test
        public void fetchCard_mapResponse() {
            when(repository.findByType(CardType.NEED))
                    .thenReturn(Arrays.asList(CardBuilder.aCard().build()));

            DisplayCardResponse response = service.fetchCard(0, CardType.NEED);

            assertResponse(response);

        }

        public void assertResponse(DisplayCardResponse response) {
            for(DisplayCard card: response.getDisplayCards()) {
                assertThat(card.getFirstName() == "Bob");
                assertThat(card.getPhotoLink() == "www.photo.com");
                assertThat(card.getTitle() == "Coffee");
                assertThat(card.getDescription() == "I need five kg of coffee");
                assertThat(card.getType() == CardType.NEED);
            }

        }
}
