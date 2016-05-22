package com.jll.stickrmgr.system;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.UserData;

@Service
public interface Manager {

	// Operations by User
	
	void loginUser(UserData userData);
	void logoutUser(String userName);
	
	// Operations by Deck
	
	long createDeck(Deck deck);
	void removeDeck(Deck deck);
	void removeDeckByName(String deckName);
	Deck findDeckByName(String name);
	boolean isValidNewDeckName(String name);
	boolean isExistingDeckName(String deckName);
	int addCardToDeck(String deckName, Card aCard);

	// Card Operations
	
	boolean removeCardByDeck(Card aCard, String deckName);
	Card findCardByDeck(Card aCard, String deckName);
	List<Card> findCardsByDeckName(String deckName);
	int countCardsByDeck(Card aCard, String name);
}
