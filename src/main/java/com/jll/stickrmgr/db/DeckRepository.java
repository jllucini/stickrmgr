package com.jll.stickrmgr.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;

public interface DeckRepository  extends JpaRepository<Deck, Long>{
	
	Deck save (Deck deck);
	
	//@Query("select name from Deck d where d.name=?1")
	Deck findByName(String deckName);
}
