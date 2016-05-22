Feature: AddSticker
			
	@AddDeck			
	Scenario: Add a sticker to the album
		Given I have got a sticker
			| code	| description	| 
			|	142		|	iniesta			|
		And I have a valid deck with name "uefa2016b"
		Then I add the sticker to the deck
		And The sticker count is 1

	Scenario: Add a second sticker to the album
	  Given I have got a sticker
	    | code	| description	|
	    |	143		|	Ramos			|
	  And I have a valid deck with name "uefa2016b"
	  Then I add the sticker to the deck
	  And The sticker count is 1
  	
	Scenario: Add another sticker to the album
		Given I have got a sticker
			| code	| description	|
			|	142		|	iniesta			|
		And I have a valid deck with name "uefa2016b"
		Then I add the sticker to the deck
		And The sticker count is 2
	
	@RemoveDeck
	Scenario: Remove a sticker to the album
		Given I have got a sticker
			| code	| description	|
			|	142		|	iniesta			|
		And I have a valid deck with name "uefa2016b"
		Then I remove the sticker from the deck
		And The sticker count is 1