package com.jll.stickrmgr.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;

/**
 * Repository interface with operations for {@link Sticker} persistence.
 */
public interface CardRepository extends JpaRepository<Card, Long>{
	
	Card save(Card card);
	
	List<Card> findByDeck(String deck);
	
	Card findByCode(String code);
	
	int countByDeckAndCode(Deck deck, String code);
}