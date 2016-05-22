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
	 
	Scenario Outline: Incorrect Deck Creation
	When I request to create a deck with name "<deckname>"
	But  The name is invalid
	Then The system refuses the create action
	Examples: 
			|  deckname |
			|  uefa2016 |

	Scenario: Successful Deck Removal
	When I request to remove a deck with name "uefa2016"
	And  The deck exists and request confirmation
	Then The system removes the deck 
	And  A confirmation message is provided
	
	Scenario: Wrong Deck Removal
	When I request to remove a deck with name "champions"
	But  The deck doesnt exist
	Then A warning message is provided 
	