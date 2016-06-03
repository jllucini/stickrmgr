package com.jll.stickrmgr.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.UserData;

/**
 * Repository interface with operations for {@link Sticker} persistence.
 */
public interface DeckRepository  extends JpaRepository<Deck, Long>{
	
	Deck save (Deck deck);
	
	@Modifying
	@Transactional
	void removeByNameAndUser(String deckName, UserData user);
	
	@Query("SELECT d FROM Deck d WHERE d.name = :deckName and d.user = :userData")
	Deck findByNameAndUser(@Param("deckName")String deckName, @Param("userData")UserData user);
}
