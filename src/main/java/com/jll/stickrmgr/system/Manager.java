package com.jll.stickrmgr.system;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.CardDTO;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.domain.UserData;

@Service
public interface Manager {

	// Operations by User
	
	void loginUser(UserData userData);
	void logoutUser(UserData userData);
	
	// Operations by Deck
	
	long createDeck(DeckDTO deck);
	void removeDeckByName(String deckName);
	Deck findDeckByName(String name);
	boolean isValidNewDeckName(String name);
	boolean isExistingDeckName(String deckName);
	int addCardToDeck(CardDTO aCard, String deckName);

	// Card Operations
	
	int removeCardByDeck(CardDTO aCard, String deckName);
	Card findCardByDeck(CardDTO aCard, String deckName);
	List<Card> findCardsByDeckName(String deckName);
	int countCardsByDeck(CardDTO aCard, String name);
}
