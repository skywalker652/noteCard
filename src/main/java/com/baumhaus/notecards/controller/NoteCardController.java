package com.baumhaus.notecards.controller;

import com.baumhaus.notecards.controller.dto.DisplayCard;
import com.baumhaus.notecards.controller.dto.DisplayCardResponse;
import com.baumhaus.notecards.model.CardType;
import com.baumhaus.notecards.service.NoteCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://localhost:3000")
public class NoteCardController {

    @Autowired
    private NoteCardService notecardService;

    @GetMapping("/need/cards")
    public DisplayCardResponse fetchNeedCards(@RequestParam(name="offset", required = false) Integer offset) {
        return notecardService.fetchCard(offset, CardType.NEED);
    }

    @GetMapping("/offer/cards")
    public DisplayCardResponse fetchWantCards(@RequestParam(name="offset", required = false) Integer offset) {
        return notecardService.fetchCard(offset, CardType.OFFER);
    }

}
