package com.jll.stickrmgr.system;

import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.system.UIDeckFacade;

public interface UIDeckFacade {
	
	public static enum MsgType {
	    INFO, ERROR, WARNING;	 
	}
	
	public static enum Messages {
	    DECK_CREATION_OK ("Your deck has been created"),
	    DECK_CREATION_CANCELLED ("The creation is cancelled"),
	    DECK_INVALID_NAME ("The deck name is invalid"),
	    DECK_REALLY_WANT_DELETE ("Do you really want to delete the deck?"),
	    DECK_DELETED_OK ("Your deck has been deleted"),
	    DECK_DOESNT_EXIST ("The deck doesnt exist");
	    
	    private final String msg;

	    private Messages(String msg) {
	        this.msg = msg;
	    }
	}
	
    public String requestCreateDeck(DeckDTO deck);

    public String requestRemoveDeck(DeckDTO deck);

    public String displayFeedback(MsgType type, Messages msg);

    public String displayConfirmation(Messages msg);
}