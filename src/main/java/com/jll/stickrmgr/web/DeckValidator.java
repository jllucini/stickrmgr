package com.jll.stickrmgr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.system.Manager;
import com.jll.stickrmgr.system.UIDeckFacade;

public class DeckValidator implements Validator {

    @Autowired
    private Manager manager;

    public boolean supports(Class clazz) {
        return DeckDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmptyOrWhitespace(e, "name", UIDeckFacade.Messages.DECK_INVALID_NAME.toString());
        DeckDTO aDeck = (DeckDTO) obj;
        if (manager.isValidNewDeckName(aDeck.getName())) {
        	e.rejectValue("name", UIDeckFacade.Messages.DECK_INVALID_NAME.toString());
        }
    }

}
