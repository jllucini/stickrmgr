$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/addstickr.feature");
formatter.feature({
  "line": 1,
  "name": "AddSticker",
  "description": "",
  "id": "addsticker",
  "keyword": "Feature"
});
formatter.before({
  "duration": 151303696,
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
  "name": "I have a valid deck with name \"uefa2016b\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I add the sticker to the deck",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The sticker count is 1",
  "keyword": "And "
});
formatter.match({
  "location": "StickerMgmt.i_have_got_a_sticker(CardDTO\u003e)"
});
formatter.result({
  "duration": 161608301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "uefa2016b",
      "offset": 31
    }
  ],
  "location": "StickerMgmt.i_have_a_valid_deck_with_name(String)"
});
formatter.result({
  "duration": 48727562,
  "status": "passed"
});
formatter.match({
  "location": "StickerMgmt.i_add_the_sticker_to_the_deck()"
});
