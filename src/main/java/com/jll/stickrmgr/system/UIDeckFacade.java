package com.jll.stickrmgr.system;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.system.UIDeckFacade;

public interface UIDeckFacade {
	
	public static enum MsgType {
	    INFO, ERROR, WARNING;	 
	}
	
	public static enum Messages {
	    DECK_CREATION_OK ("deck.created.ok"),
	    DECK_CREATION_CANCELLED ("deck.creation.cancelled"),
	    DECK_INVALID_NAME ("deck.name.invalid"),
	    DECK_REALLY_WANT_DELETE ("deck.confirm.delete.question"),
	    DECK_DELETED_OK ("deck.deletion.ok"),
	    DECK_DOESNT_EXIST ("deck.doesnt.exist");
	    
	    private final String msg;

	    private Messages(String msg) {
	        this.msg = msg;
	    }
	}
	
    public String viewCreateDeckForm(DeckDTO deck, BindingResult result);

    public String viewRemoveDeckForm(String deckName);

    public String displayFeedback(MsgType type, Messages msg);

    public String displayConfirmation(Messages msg);
}