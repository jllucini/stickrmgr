package com.jll.stickrmgr.system;

import org.springframework.stereotype.Service;

import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.UserData;

@Service
public interface Manager {

	void loginUser(UserData userData);
	
	void logoutUser(String userName);
	
	long createDeck(Deck deck);
	
	void removeDeck(Deck deck);
	
	Deck findDeckByName(String name);
	
	boolean isValidNewDeckName(String name);

	boolean isExistingDeckName(String deckName);
	
	Card addCardToDeck(Card card, String deckName);

	void removeDeckByName(String string);

	void removerCardFromDeck(Card aCard, String string);
}
