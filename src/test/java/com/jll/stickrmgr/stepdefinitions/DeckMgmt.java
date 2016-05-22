package com.jll.stickrmgr.stepdefinitions;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;
import com.jll.stickrmgr.domain.*;
import com.jll.stickrmgr.system.Manager;
import cucumber.api.PendingException;
import cucumber.api.java.en.*; 

@ContextConfiguration("classpath:cucumber.xml")
@Transactional
public class DeckMgmt {

	@Autowired
	private Manager manager ;
	
	private String deckName;
	
	
	@Given("^I am a registered user$")
	public void i_am_a_registered_user(List<UserData> user) throws Throwable {
		for (UserData userData : user) {
			//manager.loginUser(userData);
        }
	}

	// Deck Creation
	
	@When("^I request to create a deck with name \"([^\"]*)\"$")
	public void i_request_to_create_a_deck_with_name(String name) throws Throwable {
		deckName = name;
	}

	@And("^The name is valid$")
	public void the_name_is_valid() throws Throwable {
	    Assert.isTrue(manager.isValidNewDeckName(deckName));
	}

	@Then("^The system creates a valid empty deck$")
	public void the_system_creates_a_valid_empty_deck() throws Throwable {
		Deck aDeck = new Deck(deckName); 
		manager.createDeck(aDeck);
	}

	@But("^The name is invalid$")
	public void the_name_is_invalid() throws Throwable {
	    Assert.isTrue(!manager.isValidNewDeckName(deckName));
	}

	@Then("^The system refuses the create action$")
	public void the_system_refuses_the_create_action() throws Throwable {
	    throw new PendingException();
	}
	
	// Deck removal
	@When("^I request to remove a deck with name \"([^\"]*)\"$")
	public void i_request_to_remove_a_deck_with_name(String name) throws Throwable {
		deckName = name;
	}

	@And("^The deck exists and request confirmation$")
	public void the_deck_exists_and_request_confirmation() throws Throwable {
	    Assert.isTrue(manager.isExistingDeckName(deckName));
	}
	
	@Then("^The system removes the deck$")
	public void the_system_removes_the_deck() throws Throwable {
	    manager.removeDeckByName(deckName);
	}

	@And("^A confirmation message is provided$")
	public void a_confirmation_message_is_provided() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@But("^The deck doesnt exist$")
	public void the_deck_doesnt_exist() throws Throwable {
		boolean b = manager.isExistingDeckName(deckName);
	    Assert.isTrue(!b);
	}

	@Then("^A warning message is provided$")
	public void a_warning_message_is_provided() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
