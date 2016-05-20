Feature: Deck Management

	A registered user creates a card deck
	
	Background:
	Given I am a registered user 
			| username	| password	|
			|	joseluis	|	abcd123		|
	
	Scenario: Successful Deck Creation
	When I request to create a deck with name "uefa2016"
	And  The name is valid
	Then The system creates a valid empty deck  
	
	Scenario: Incorrect Deck Creation
	When I request to remove a deck with name "uefa2016"
	But  The name is invalid
	Then The system refuses the create action

	Scenario: Successful Deck Removal
	When I request to remove a deck with name <deck_name>
	And  I provide a valid deck name
	Then The system removes the deck 
	And  A confirmation message is provided
	
	Scenario: Wrong Deck Removal
	When I request to remove a deck
	But  I provide an invalid deck name
	Then The system dont removes the deck
	And  A warning message is provided 
	