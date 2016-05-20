package com.jll.stickrmgr.system;

import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.domain.UserData;

public interface Manager {

	void loginUser(UserData userData);
	
	void logoutUser(String userName);
	
	long createDeck(Deck deck);
	
	Deck findDeckByName(String name);
}
