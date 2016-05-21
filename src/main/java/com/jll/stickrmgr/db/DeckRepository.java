package com.jll.stickrmgr.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;

/**
 * Repository interface with operations for {@link Sticker} persistence.
 */
public interface DeckRepository  extends JpaRepository<Deck, Long>{
	
	Deck save (Deck deck);
	
	void removeByName(String deckName);
	
	Deck findByName(String deckName);
}
