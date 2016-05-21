package com.jll.stickrmgr.db.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jll.stickrmgr.db.CardRepository;
import com.jll.stickrmgr.domain.Card;

//@Repository
public class JpaCardRepository  {

	@PersistenceContext
	private EntityManager entityManager;

	public long countByDeck(String deck) {
		return findByDeck(deck).size();
	}

	public Card save(Card card) {
		entityManager.persist(card);
		return card;
	}

	public Card findOne(long id) {
		return entityManager.find(Card.class, id);
	}

	public Card findByCodeAndDeck(String code, String deck) {		
		return (Card) entityManager.createQuery("select c from Card c, Deck d where c.code=? and d.name=? and d.id=c.deck_id").setParameter(1, code).setParameter(2, deck).getSingleResult();
	}

	public List<Card> findByDeck(String deck) {
		return (List<Card>) entityManager.createQuery("select c from Card c, Deck d where d.name=? and d.id=c.deck_id").setParameter(1, deck).getResultList();
	}
	
}
