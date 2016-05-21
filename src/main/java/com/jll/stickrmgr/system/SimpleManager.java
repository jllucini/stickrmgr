package com.jll.stickrmgr.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.jll.stickrmgr.db.DeckRepository;
import com.jll.stickrmgr.db.CardRepository;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.UserData;

@Service
public class SimpleManager implements Manager{

	private static UserData userData;

	@Autowired
	DeckRepository deckRepo;
	
	@Autowired
	CardRepository cardRepo;
	
	@Override
	public void loginUser(UserData userData) {
		// TODO Auto-generated method stub
		this.userData = userData;
	}

	@Override
	public void logoutUser(String userName) {
		// TODO Auto-generated method stub
		this.userData = null;
	}

	@Override
	public Deck findDeckByName(String deckName){
		return deckRepo.findByName(deckName);
	}
	
	@Override
	public long createDeck(Deck deck){
		deckRepo.save(deck);
		return 0;
	}
	
	@Override
	public boolean isValidNewDeckName(String deckName){
		boolean b = deckRepo.findByName(deckName) == null;
		return (deckName != null && !deckName.isEmpty() && b);
	}

	@Override
	public void removeDeck(Deck deck) {
		deckRepo.delete(deck);		
	}

	@Override
	public boolean isExistingDeckName(String deckName) {
		return (deckName != null && !deckName.isEmpty() && deckRepo.findByName(deckName) != null);
	}

	@Override
	public int addCardToDeck(Card card, String deckName) {
		Deck deck = deckRepo.findByName(deckName);
		card.setDeck(deck);
		cardRepo.save(card);
		return cardRepo.countByDeckAndCode(deck, card.getCode());
	}

	@Override
	public void removeDeckByName(String deckName) {
		deckRepo.removeByName(deckName);
	}

	@Override
	public void removerCardFromDeck(Card aCard, String string) {
		cardRepo.delete(aCard);
	}
}
