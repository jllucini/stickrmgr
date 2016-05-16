package com.jll.stickrmgr;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jll.stickrmgr.db.SpringDataJPAConfig;
import com.jll.stickrmgr.db.jpa.JpaCardRepository;
import com.jll.stickrmgr.db.jpa.JpaDeckRepository;
import com.jll.stickrmgr.domain.Card;
import com.jll.stickrmgr.domain.Deck;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/cucumber"},	 glue = {"com.jll.stickrmgr.stepdefinitions"}		)

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringDataJPAConfig.class)
@Transactional
public class RunCukesTest {

	/*
	@Autowired
	JpaDeckRepository deckRepo;
	
	@Autowired
	JpaCardRepository cardRepo;
	
	@Test
	public void testRepo(){
		Card aCard = new Card("142", "iniesta", null);
		Deck aDeck = new Deck("uefa2016");
		
		deckRepo.save(aDeck);
		
		aCard.setDeck(aDeck);
		cardRepo.save(aCard);
	}
	*/
}