Feature: AddSticker

	Scenario: Add a sticker to the album
		Given I have got a sticker
			| code	| description	|
			|	142		|	iniesta			|
		And I have a valid album with name "uefa2016"
		Then I add the sticker to the album



	