package com.jll.stickrmgr.stepdefinitions;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.jll.stickrmgr.db.UserRepository;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck; 
import com.jll.stickrmgr.domain.UserData;
import com.jll.stickrmgr.system.Manager;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*; 

@ContextConfiguration("classpath:cucumber.xml")
@Transactional
public class StickerMgmt {

	@Autowired
	private Manager manager ;
	
	@Autowired
	UserRepository userRepo;
	
	private Card aCard;
	private Deck aDeck;
	private UserData userData;
	
	@Before("@AddDeck")
	public void beforeScenario(){
		aDeck = new Deck("uefa2016b");
		userData = new UserData("joseluis1", "abcd123");
		userRepo.save(userData);
		manager.loginUser(userData);
		manager.createDeck(aDeck);
	}
	
	@After("@RemoveDeck")
	public void afterScenario() {
		for (Card card : manager.findCardsByDeckName(aDeck.getName())){
			manager.removeCardByDeck(card, aDeck.getName());
		}
		
		manager.removeDeckByName(aDeck.getName());
		//manager.logoutUser(userData);
		
	}

	@Given("^I am another registered user$")
	public void i_am_another_registered_user(List<UserData> user) throws Throwable {
		for (UserData userData : user) {
			//manager.loginUser(userData);
        }
	}

	@Given("^I have got a sticker$")
	public void i_have_got_a_sticker(List<Card> card) throws Throwable {
		for (Card auxCard : card) {
			aCard = auxCard;
        }
	}
	
	@And("^I have a valid deck with name \"([^\"]*)\"$")
	public void i_have_a_valid_deck_with_name(String deckName) throws Throwable {
		aDeck = manager.findDeckByName(deckName);
		Assert.isTrue(aDeck != null);
	}

	@Then("^I add the sticker to the deck$")
	public void i_add_the_sticker_to_the_deck() throws Throwable {
	    int nCards = manager.addCardToDeck(aDeck.getName(), aCard);
	    Assert.isTrue(nCards > 0);
	}

	@Then("^I remove the sticker from the deck$")
	public void i_remove_the_sticker_from_the_deck() throws Throwable {
		int nCardsBefore = manager.countCardsByDeck(aCard, aDeck.getName());
		manager.removeCardByDeck(aCard, aDeck.getName());
	    int nCardsAfter  = manager.countCardsByDeck(aCard, aDeck.getName());
	    Assert.isTrue(nCardsBefore > nCardsAfter);
	}
	
	@And("^The sticker count is (\\d+)$")
	public void the_sticker_count_is(int aNum) throws Throwable {
		int total = manager.countCardsByDeck(aCard, aDeck.getName());
	    Assert.isTrue(total == aNum);
	}
}
