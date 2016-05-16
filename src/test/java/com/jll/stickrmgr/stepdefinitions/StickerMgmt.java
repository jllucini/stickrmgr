package com.jll.stickrmgr.stepdefinitions;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jll.stickrmgr.db.DeckRepository;
import com.jll.stickrmgr.db.SpringDataJPAConfig;
import com.jll.stickrmgr.db.jpa.JpaCardRepository;
import com.jll.stickrmgr.db.jpa.JpaDeckRepository;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;

import cucumber.api.PendingException;
import cucumber.api.java.en.*; 

@ContextConfiguration("classpath:cucumber.xml")
@Transactional
public class StickerMgmt {

	@Autowired
	DeckRepository deckRepo;
	
	@Autowired
	JpaCardRepository cardRepo;
	
	private Card aCard;
	private Deck aDeck;
	
	@Given("^I have got a sticker$")
	public void i_have_got_a_sticker(List<Card> card) throws Throwable {
		for (Card auxCard : card) {
			aCard = auxCard;
        }
	}

	@Given("^I have a valid (album)$")
	public void i_have_a_valid_album(String deckName) throws Throwable {
		//JpaDeckRepository deckRepo = new JpaDeckRepository();
	    aDeck = new Deck(deckName);
	    deckRepo.save(aDeck);
	}

	@Then("^I add the sticker to the album$")
	public void i_add_the_sticker_to_the_album() throws Throwable {
		//JpaCardRepository cardRepo = new JpaCardRepository();
	    aCard.setDeck(aDeck);
	    cardRepo.save(aCard);
	}

}
