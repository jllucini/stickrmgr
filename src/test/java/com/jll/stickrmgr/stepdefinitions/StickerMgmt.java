package com.jll.stickrmgr.stepdefinitions;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;
import com.jll.stickrmgr.system.Manager;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*; 

@ContextConfiguration("classpath:cucumber.xml")
@Transactional
public class StickerMgmt {

	@Autowired
	private Manager manager ;
	
	private Card   aCard;
	private String aDeck;
	
	@Before("@AddDeck")
	public void beforeScenario() {
		Deck aDeck = new Deck("uefa2016");
		manager.createDeck(aDeck);
	}
	
	@After("@RemoveDeck")
	public void afterScenario() {
		manager.removerCardFromDeck(aCard, "uefa2016");
		manager.removeDeckByName("uefa2016");
	}
	
	@Given("^I have a valid deck with name \"([^\"]*)\"$")
	public void i_have_a_valid_deck_with_name(String deckName) throws Throwable {
		aDeck = deckName;
		Assert.isTrue(manager.isExistingDeckName(deckName));
	}
	
	@Given("^I have got a sticker$")
	public void i_have_got_a_sticker(List<Card> card) throws Throwable {
		for (Card auxCard : card) {
			aCard = auxCard;
        }
	}

	@Then("^I add the sticker to the deck$")
	public void i_add_the_sticker_to_the_deck() throws Throwable {
	    aCard = manager.addCardToDeck(aCard, aDeck);
	    Assert.isTrue(aCard.getCount() > 0);
	}

	@Then("^The count of stickers is (\\d+)$")
	public void the_count_of_stickers_is(int aNum) throws Throwable {
		int numCards = aCard.getCount();
	    Assert.isTrue(numCards == aNum);
	}
}
