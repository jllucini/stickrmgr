package com.jll.stickrmgr.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.jll.stickrmgr.db.DeckRepository;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.UserData;

public class SimpleManager implements Manager{

	private static UserData userData;

	@Autowired
	DeckRepository deckRepo;
	
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

	public Deck findDeckByName(String deckName){
		return deckRepo.findByName(deckName);
	}
	
	public long createDeck(Deck deck){
		deckRepo.save(deck);
		return 0;
	}
}
