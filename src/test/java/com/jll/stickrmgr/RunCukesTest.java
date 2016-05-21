package com.jll.stickrmgr;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/cucumber"}, glue = {"com.jll.stickrmgr.stepdefinitions"}, 
				 plugin = {"pretty", "html:src/cucumber/reports"})
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