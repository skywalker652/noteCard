package com.baumhaus.notecards.controller;

import com.baumhaus.notecards.model.CardType;
import com.baumhaus.notecards.service.NoteCardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class NoteCardControllerTest {

    @InjectMocks
    private NoteCardController notecardController;

    @Mock
    private NoteCardService notecardService;

    @Test
    public void getNeedCards_noOffset_serviceCalled() {
        notecardController.fetchNeedCards(null);

        verify(notecardService, times(1)).fetchCard(null, CardType.NEED);
    }

    @Test
    public void getNeedCards_withOffset_serviceCalled() {
        Integer offset = 5;
        notecardController.fetchNeedCards(offset);

        verify(notecardService, times(1)).fetchCard(offset, CardType.NEED);
    }

    @Test
    public void getOfferCards_noOffset_serviceCalled() {
        notecardController.fetchNeedCards(null);

        verify(notecardService, times(1)).fetchCard(null, CardType.OFFER);
    }

    @Test
    public void getOfferCards_withOffset_serviceCalled() {
        Integer offset = 5;
        notecardController.fetchNeedCards(offset);

        verify(notecardService, times(1)).fetchCard(offset, CardType.OFFER);
    }


}



