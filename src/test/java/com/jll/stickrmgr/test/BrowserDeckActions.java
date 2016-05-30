package com.jll.stickrmgr.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import com.jll.stickrmgr.domain.DeckDTO;
import com.jll.stickrmgr.domain.UserData;
import com.jll.stickrmgr.system.Manager;
import com.jll.stickrmgr.system.UIDeckFacade;

public class BrowserDeckActions implements UIDeckFacade {

	@Autowired
	private TestWebDriver webDriver; 	
	
	@Override
	public String viewCreateDeckForm(DeckDTO deck) {
		webDriver.get("http://localhost:8080/deck/register");
		WebElement input = webDriver.findElement(By.id("f_name"));
		input.sendKeys(deck.getName());
		WebElement submit = webDriver.findElement(By.id("f_submit"));
		submit.click();
		return "";
	}

	@Override
	public String viewRemoveDeckForm(DeckDTO deck) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayFeedback(MsgType type, Messages msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayConfirmation(Messages msg) {
		// TODO Auto-generated method stub
		return null;
	}

}
