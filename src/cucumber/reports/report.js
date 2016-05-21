$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/addstickr.feature");
formatter.feature({
  "line": 1,
  "name": "AddSticker",
  "description": "",
  "id": "addsticker",
  "keyword": "Feature"
});
formatter.before({
  "duration": 143971726,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add a sticker to the album",
  "description": "",
  "id": "addsticker;add-a-sticker-to-the-album",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AddDeck"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have got a sticker",
  "rows": [
    {
      "cells": [
        "code",
        "description"
      ],
      "line": 6
    },
    {
      "cells": [
        "142",
        "iniesta"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I have a valid deck with name \"uefa2016\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I add the sticker to the deck",
  "keyword": "Then "
});
formatter.match({
  "location": "StickerMgmt.i_have_got_a_sticker(Card\u003e)"
});
formatter.result({
  "duration": 189694442,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "uefa2016",
      "offset": 31
    }
  ],
  "location": "StickerMgmt.i_have_a_valid_deck_with_name(String)"
});
formatter.result({
  "duration": 340531776,
  "status": "passed"
});
formatter.match({
  "location": "StickerMgmt.i_add_the_sticker_to_the_deck()"
});
formatter.result({
  "duration": 53608403,
  "status": "passed"
});
formatter.after({
  "duration": 53563044,
  "status": "passed"
});
formatter.uri("resources/deckmagmt.feature");
formatter.feature({
  "line": 1,
  "name": "Deck Management",
  "description": "\r\nA registered user creates a card deck",
  "id": "deck-management",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am a registered user",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "joseluis",
        "abcd123"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DeckMgmt.i_am_a_registered_user(UserData\u003e)"
});
formatter.result({
  "duration": 32772874,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Successful Deck Creation",
  "description": "",
  "id": "deck-management;successful-deck-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I request to create a deck with name \"uefa2016\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The name is valid",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The system creates a valid empty deck",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "uefa2016",
      "offset": 38
    }
  ],
  "location": "DeckMgmt.i_request_to_create_a_deck_with_name(String)"
});
formatter.result({
  "duration": 1626825,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_name_is_valid()"
});
formatter.result({
  "duration": 4314404,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_system_creates_a_valid_empty_deck()"
});
formatter.result({
  "duration": 3566860,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Incorrect Deck Creation",
  "description": "",
  "id": "deck-management;incorrect-deck-creation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I request to create a deck with name \"\u003cdeckname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "The name is invalid",
  "keyword": "But "
});
formatter.step({
  "line": 18,
  "name": "The system refuses the create action",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "deck-management;incorrect-deck-creation;",
  "rows": [
    {
      "cells": [
        "deckname"
      ],
      "line": 20,
      "id": "deck-management;incorrect-deck-creation;;1"
    },
    {
      "cells": [
        "uefa2016"
      ],
      "line": 21,
      "id": "deck-management;incorrect-deck-creation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am a registered user",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "joseluis",
        "abcd123"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DeckMgmt.i_am_a_registered_user(UserData\u003e)"
});
formatter.result({
  "duration": 2451268,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Incorrect Deck Creation",
  "description": "",
  "id": "deck-management;incorrect-deck-creation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 16,
  "name": "I request to create a deck with name \"uefa2016\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "The name is invalid",
  "keyword": "But "
});
formatter.step({
  "line": 18,
  "name": "The system refuses the create action",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "uefa2016",
      "offset": 38
    }
  ],
  "location": "DeckMgmt.i_request_to_create_a_deck_with_name(String)"
});
formatter.result({
  "duration": 1507455,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_name_is_invalid()"
});
formatter.result({
  "duration": 6945535,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_system_refuses_the_create_action()"
});
formatter.result({
  "duration": 4075925,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.jll.stickrmgr.stepdefinitions.DeckMgmt.the_system_refuses_the_create_action(DeckMgmt.java:62)\n\tat ✽.Then The system refuses the create action(resources/deckmagmt.feature:18)\n",
  "status": "pending"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am a registered user",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "joseluis",
        "abcd123"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DeckMgmt.i_am_a_registered_user(UserData\u003e)"
});
formatter.result({
  "duration": 2789225,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Successful Deck Removal",
  "description": "",
  "id": "deck-management;successful-deck-removal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I request to remove a deck with name \"uefa2016\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "The deck exists and request confirmation",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "The system removes the deck",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "A confirmation message is provided",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "uefa2016",
      "offset": 38
    }
  ],
  "location": "DeckMgmt.i_request_to_remove_a_deck_with_name(String)"
});
formatter.result({
  "duration": 1648261,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_deck_exists_and_request_confirmation()"
});
formatter.result({
  "duration": 5393017,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_system_removes_the_deck()"
});
formatter.result({
  "duration": 8654681,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.a_confirmation_message_is_provided()"
});
formatter.result({
  "duration": 1763206,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.jll.stickrmgr.stepdefinitions.DeckMgmt.a_confirmation_message_is_provided(DeckMgmt.java:84)\n\tat ✽.And A confirmation message is provided(resources/deckmagmt.feature:27)\n",
  "status": "pending"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am a registered user",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "joseluis",
        "abcd123"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DeckMgmt.i_am_a_registered_user(UserData\u003e)"
});
formatter.result({
  "duration": 3491636,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Wrong Deck Removal",
  "description": "",
  "id": "deck-management;wrong-deck-removal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "I request to remove a deck with name \"champions\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "The deck doesnt exist",
  "keyword": "But "
});
formatter.step({
  "line": 32,
  "name": "A warning message is provided",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "champions",
      "offset": 38
    }
  ],
  "location": "DeckMgmt.i_request_to_remove_a_deck_with_name(String)"
});
formatter.result({
  "duration": 1717687,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_deck_doesnt_exist()"
});
formatter.result({
  "duration": 3689499,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.a_warning_message_is_provided()"
});
formatter.result({
  "duration": 1751812,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.jll.stickrmgr.stepdefinitions.DeckMgmt.a_warning_message_is_provided(DeckMgmt.java:96)\n\tat ✽.Then A warning message is provided(resources/deckmagmt.feature:32)\n",
  "status": "pending"
});
});