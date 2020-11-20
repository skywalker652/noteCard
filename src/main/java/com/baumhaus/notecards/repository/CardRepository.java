package com.baumhaus.notecards.repository;

import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByType(CardType cardType);
}