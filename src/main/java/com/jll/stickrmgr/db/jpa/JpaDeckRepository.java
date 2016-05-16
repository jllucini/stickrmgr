package com.jll.stickrmgr.db.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jll.stickrmgr.db.DeckRepository;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;

//@Repository
public class JpaDeckRepository {
/*
	@PersistenceContext
	private EntityManager entityManager;

	public Deck save(Deck deck) {
		entityManager.persist(deck);
		return deck;
	}

	public Deck findByName(String deckName) {
		List<Deck> lDeck = (List<Deck>) entityManager.createQuery("select d from Deck d where d.name=?").setParameter(1, deckName).getResultList();
		if (lDeck != null && !lDeck.isEmpty()){
			return lDeck.get(0);
		} else {
			return null;
		}
	}
*/
}
