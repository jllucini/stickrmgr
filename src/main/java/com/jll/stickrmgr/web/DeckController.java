package com.jll.stickrmgr.web;

import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.system.Manager;
import com.jll.stickrmgr.system.UIDeckFacade;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value={"/deck"})
public class DeckController implements UIDeckFacade {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DeckController.class);
	
    @Autowired
    private Manager manager;

    @RequestMapping(value={"/register"}, method={RequestMethod.GET})
    public String getCreateForm(Model model) {
        model.addAttribute("deckDTO", new DeckDTO(""));
        return "/deck/register";
    }

    @RequestMapping(value={"/register"}, method={RequestMethod.POST})
    public String viewCreateDeckForm(@Valid @ModelAttribute DeckDTO aDeck, BindingResult result) {
        if (!result.hasErrors()) {
            manager.createDeck(aDeck);
            LOGGER.debug("** {} -> Deck created {}", "viewCreateDeckForm", aDeck.getName());
            return "/deck/register";
        }else{
        	LOGGER.debug("** {} -> Invalid deck name: {}", "viewCreateDeckForm", aDeck.getName());
	        return "redirect:/deck/register";
        }
    }

    @RequestMapping(value={"/remove"}, method={RequestMethod.GET})
    public String getRemoveDeckForm(Model model) {
    	List<DeckDTO> lDeck = manager.getDeckList();
        model.addAttribute("deckList", lDeck);
        return "/deck/remove";
    }
    
    @RequestMapping(value={"/remove"}, method={RequestMethod.POST})
    public String viewRemoveDeckForm(@RequestParam("deckitem") String deckName) {
    	LOGGER.debug("** {} -> {}", "viewRemoveDeckForm", deckName);
    	if (deckName != null) manager.removeDeckByName(deckName);
        return "redirect:/deck/remove";
    }

    public String displayFeedback(UIDeckFacade.MsgType severity, UIDeckFacade.Messages feedback) {
        return "";
    }

    public String displayConfirmation(UIDeckFacade.Messages message) {
        return "";
    }

}
