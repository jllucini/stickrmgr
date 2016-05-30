package com.jll.stickrmgr.web;

import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.system.Manager;
import com.jll.stickrmgr.system.UIDeckFacade;
import java.io.PrintStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/deck"})
public class DeckController implements UIDeckFacade {
	
    @Autowired
    private Manager manager;

    @RequestMapping(value={"/register"}, method={RequestMethod.GET})
    public String viewForm(Model model) {
        model.addAttribute("deckDTO", new DeckDTO(""));
        return "/deck/register";
    }

    @RequestMapping(value={"/register"}, method={RequestMethod.POST})
    public String viewCreateDeckForm(@ModelAttribute DeckDTO aDeck) {
        if (manager.isValidNewDeckName(aDeck.getName())) {
            this.manager.createDeck(aDeck);
            System.out.println("**** Deck registered: " + aDeck.getName());
            return "/deck/register";
        }else{
	        System.out.println("**** Invalid deck name: " + aDeck.getName());
	        return "redirect:/deck/register";
        }
    }

    public String viewRemoveDeckForm(DeckDTO aDeck) {
        return "";
    }

    public String displayFeedback(UIDeckFacade.MsgType severity, UIDeckFacade.Messages feedback) {
        return "";
    }

    public String displayConfirmation(UIDeckFacade.Messages message) {
        return "";
    }

}
