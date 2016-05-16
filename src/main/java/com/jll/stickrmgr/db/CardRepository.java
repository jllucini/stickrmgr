package com.jll.stickrmgr.db;

import java.util.List;

import com.jll.stickrmgr.domain.Card;

/**
 * Repository interface with operations for {@link Sticker} persistence.
 */
public interface CardRepository {

	long countByDeck(String deck);

	Card save(Card card);

	Card findOne(long id);

	Card findByCodeAndDeck(String code, String deck);

	List<Card> findByDeck(String deck);
}