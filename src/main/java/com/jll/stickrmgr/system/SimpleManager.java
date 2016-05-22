package com.jll.stickrmgr.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jll.stickrmgr.db.DeckRepository;
import com.jll.stickrmgr.db.UserRepository;
import com.jll.stickrmgr.db.CardRepository;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.UserData;

@Service
public class SimpleManager implements Manager{

	private UserData userData;

	@Autowired
	DeckRepository deckRepo;
	
	@Autowired
	CardRepository cardRepo;
	
	// Operations by User
	
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
	
	// Operations by Deck
	
	@Override
	public long createDeck(Deck deck){
		deck.setUser(userData);
		deckRepo.save(deck);
		return 0;
	}
	
	@Override
	public void removeDeck(Deck deck) {
		deckRepo.delete(deck);		
	}
	
	@Override
	public void removeDeckByName(String deckName) {
		deckRepo.removeByNameAndUser(deckName, userData);
	}

	@Override
	public Deck findDeckByName(String deckName){
		return deckRepo.findByNameAndUser(deckName, userData);
	}
	
	@Override
	public boolean isValidNewDeckName(String deckName){
		boolean b = deckRepo.findByNameAndUser(deckName, userData) == null;
		return (deckName != null && !deckName.isEmpty() && b);
	}

	@Override
	public boolean isExistingDeckName(String deckName) {
		return (deckName != null && !deckName.isEmpty() && deckRepo.findByNameAndUser(deckName, userData) != null);
	}

	@Override
	public int addCardToDeck(String deckName, Card aCard) {
		Deck deck = deckRepo.findByNameAndUser(deckName, userData);
		Card card = cardRepo.findByCodeAndDeck(aCard.getCode(), deck);
		if (card != null){
			card.incrementCount();
			cardRepo.save(card);
		} else {
			card = aCard;
			card.setDeck(deck);
			card.setCount(1);
			cardRepo.save(card);
		}
		return card.getCount();
	}

	// Card Operations
	
	@Override
	public boolean removeCardByDeck(Card aCard, String deckName) {
		boolean ok = false;
		Card auxCard = findCardByDeck(aCard, deckName);
		if (auxCard != null){
			auxCard.substractCount();
			cardRepo.save(auxCard);
			if (auxCard.getCount() == 0){
				cardRepo.delete(auxCard);
			}
			ok = true;
		}
		return ok;
	}

	@Override
	public Card findCardByDeck(Card aCard, String deckName) {
		Deck aDeck = deckRepo.findByNameAndUser(deckName, userData);
		Card auxCard = null;
		if (aDeck != null && aCard != null){
			auxCard = cardRepo.findByCodeAndDeck(aCard.getCode(), aDeck);
		}
		return auxCard;
	}

	@Override
	public List<Card> findCardsByDeckName(String deckName) {
		Deck aDeck = deckRepo.findByNameAndUser(deckName, userData);
		List<Card> aList = null;
		if (aDeck != null){
			aList = cardRepo.findByDeck(aDeck);
		}
		return aList;
	}

	@Override
	public int countCardsByDeck(Card aCard, String deckName) {
		int result = 0;
		
		Card auxCard = findCardByDeck(aCard, deckName);
		if (auxCard != null){
			result = auxCard.getCount();
		}
		
		return result;
	}
}
