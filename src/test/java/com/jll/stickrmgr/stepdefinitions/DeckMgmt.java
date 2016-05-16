package com.jll.stickrmgr.stepdefinitions;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.jll.stickrmgr.db.DeckRepository;
import com.jll.stickrmgr.db.jpa.JpaDeckRepository;
import com.jll.stickrmgr.domain.Deck;

import cucumber.api.PendingException;
import cucumber.api.java.en.*; 

@ContextConfiguration("classpath:cucumber.xml")
@Transactional
public class DeckMgmt {

	@Autowired
	DeckRepository deckRepo;
	
	private Deck aDeck;
	
	@Given("^I am a registered user$")
	public void i_am_a_registered_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I request to create a deck with name (.+)$")
	public void i_request_to_create_a_deck_with_name(String deckName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    aDeck = new Deck(deckName);
	}

	@When("^The name is valid$")
	public void the_name_is_valid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	
		String deckName = aDeck.getName();
	    Assert.notNull(deckName);
	    Assert.isTrue(!deckName.isEmpty());
	    Assert.isNull(deckRepo.findByName(deckName));
	}

	@Then("^The system creates a valid empty deck$")
	public void the_system_creates_a_valid_empty_deck() throws Throwable {
	    deckRepo.save(aDeck);
	}

	@When("^I request to remove a deck$")
	public void i_request_to_remove_a_deck() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I provide an invalid deck name$")
	public void i_provide_an_invalid_deck_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The system refuses the create action$")
	public void the_system_refuses_the_create_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The system removes the deck$")
	public void the_system_removes_the_deck() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^A confirmation message is provided$")
	public void a_confirmation_message_is_provided() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^The system dont removes the deck$")
	public void the_system_dont_removes_the_deck() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^A warning message is provided$")
	public void a_warning_message_is_provided() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
