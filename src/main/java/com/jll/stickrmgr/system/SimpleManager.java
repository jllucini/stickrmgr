package com.jll.stickrmgr.system;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jll.stickrmgr.db.DeckRepository;
import com.jll.stickrmgr.db.UserRepository;
import com.jll.stickrmgr.db.CardRepository;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.CardDTO;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.domain.UserData;

@Service
public class SimpleManager implements Manager{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleManager.class);
	
	private static UserData userData; 

	@Autowired
	DeckRepository deckRepo;
	
	@Autowired
	CardRepository cardRepo;
	
	@Autowired
	UserRepository userRepo;
	
	// Operations by User
	
	@Override
	public void loginUser(UserData userData) {
		// TO review
		SimpleManager.userData = userData;
		userRepo.save(userData);
		LOGGER.info("{} -> User logged {}", "loginUser", userData.getUsername());
	}

	@Override
	public void logoutUser(UserData userName) {
		// To review
		SimpleManager.userData = null;
	}
	
	// Operations by Deck
	
	@Override
	public long createDeck(DeckDTO deckDTO){
		// TO REVIEW : Validate From post without previous login
		if (userData == null){
			this.loginUser(new UserData("joseluis", "password"));
		}
		Deck deck = new Deck(deckDTO.getName(), userData);
		deckRepo.save(deck);
		LOGGER.info("{} -> Deck created {} with user {}", "createDeck", deckDTO.getName(),userData.getUsername());
		return 0;
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
	public int addCardToDeck(CardDTO aCard, String deckName) {
		Deck deck = deckRepo.findByNameAndUser(deckName, userData);
		Card card = cardRepo.findByCodeAndDeck(aCard.getCode(), deck);
		if (card != null){
			card.incrementCount();
		} else {
			card = new Card(aCard.getCode(), aCard.getDescription(), deck);
			
		}
		cardRepo.save(card);
		return card.getCount();
	}

	// Card Operations
	
	@Override
	public int removeCardByDeck(CardDTO aCard, String deckName) {
		int result = 0;
		Card auxCard = findCardByDeck(aCard, deckName);
		if (auxCard != null){
			auxCard.substractCount();
			cardRepo.save(auxCard);
			if (auxCard.getCount() == 0){
				cardRepo.delete(auxCard);
			}
			result = auxCard.getCount();
		}
		return result;
	}

	@Override
	public Card findCardByDeck(CardDTO aCard, String deckName) {
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
	public int countCardsByDeck(CardDTO aCard, String deckName) {
		int result = 0;
		
		Card auxCard = findCardByDeck(aCard, deckName);
		if (auxCard != null){
			result = auxCard.getCount();
		}
		
		return result;
	}
}
