$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/addstickr.feature");
formatter.feature({
  "line": 1,
  "name": "AddSticker",
  "description": "",
  "id": "addsticker",
  "keyword": "Feature"
});
formatter.before({
  "duration": 205382648,
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
  "duration": 200702010,
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
  "duration": 260440492,
  "status": "passed"
});
formatter.match({
  "location": "StickerMgmt.i_add_the_sticker_to_the_deck()"
});
formatter.result({
  "duration": 70812363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "StickerMgmt.the_sticker_count_is(int)"
});
formatter.result({
  "duration": 50912719,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add a second sticker to the album",
  "description": "",
  "id": "addsticker;add-a-second-sticker-to-the-album",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I have got a sticker",
  "rows": [
    {
      "cells": [
        "code",
        "description"
      ],
      "line": 14
    },
    {
      "cells": [
        "143",
        "Ramos"
      ],
      "line": 15
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I have a valid deck with name \"uefa2016b\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I add the sticker to the deck",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "The sticker count is 1",
  "keyword": "And "
});
formatter.match({
  "location": "StickerMgmt.i_have_got_a_sticker(CardDTO\u003e)"
});
formatter.result({
  "duration": 65399661,
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
  "duration": 57588761,
  "status": "passed"
});
formatter.match({
  "location": "StickerMgmt.i_add_the_sticker_to_the_deck()"
});
formatter.result({
  "duration": 63200748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "StickerMgmt.the_sticker_count_is(int)"
});
formatter.result({
  "duration": 47255648,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Add another sticker to the album",
  "description": "",
  "id": "addsticker;add-another-sticker-to-the-album",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I have got a sticker",
  "rows": [
    {
      "cells": [
        "code",
        "description"
      ],
      "line": 22
    },
    {
      "cells": [
        "142",
        "iniesta"
      ],
      "line": 23
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I have a valid deck with name \"uefa2016b\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I add the sticker to the deck",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "The sticker count is 2",
  "keyword": "And "
});
formatter.match({
  "location": "StickerMgmt.i_have_got_a_sticker(CardDTO\u003e)"
});
formatter.result({
  "duration": 46535459,
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
  "duration": 42838452,
  "status": "passed"
});
formatter.match({
  "location": "StickerMgmt.i_add_the_sticker_to_the_deck()"
});
formatter.result({
  "duration": 59105995,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "StickerMgmt.the_sticker_count_is(int)"
});
formatter.result({
  "duration": 47400039,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Remove a sticker to the album",
  "description": "",
  "id": "addsticker;remove-a-sticker-to-the-album",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@RemoveDeck"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I have got a sticker",
  "rows": [
    {
      "cells": [
        "code",
        "description"
      ],
      "line": 31
    },
    {
      "cells": [
        "142",
        "iniesta"
      ],
      "line": 32
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "I have a valid deck with name \"uefa2016b\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I remove the sticker from the deck",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "The sticker count is 1",
  "keyword": "And "
});
formatter.match({
  "location": "StickerMgmt.i_have_got_a_sticker(CardDTO\u003e)"
});
formatter.result({
  "duration": 43085558,
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
  "duration": 41887942,
  "status": "passed"
});
formatter.match({
  "location": "StickerMgmt.i_remove_the_sticker_from_the_deck()"
});
formatter.result({
  "duration": 54677924,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "StickerMgmt.the_sticker_count_is(int)"
});
formatter.result({
  "duration": 46024386,
  "status": "passed"
});
formatter.after({
  "duration": 78924174,
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
  "duration": 75259830,
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
  "location": "DeckMgmt.i_request_to_create_a_deck_with_name(DeckDTO)"
});
formatter.result({
  "duration": 44715214,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_name_is_valid()"
});
formatter.result({
  "duration": 43088870,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_system_creates_a_valid_empty_deck()"
});
formatter.result({
  "duration": 195067957,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"f_name\"}\nCommand duration or timeout: 34 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027MacBook-Pro-de-Jose.local\u0027, ip: \u0027192.168.1.38\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.4\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d33.0, platform\u003dMAC, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 5a03fdd3-c716-be4f-a03c-6bc084fbfc7d\n*** Element info: {Using\u003did, value\u003df_name}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:103)\n\tat com.sun.proxy.$Proxy80.findElement(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:188)\n\tat com.jll.stickrmgr.test.BrowserDeckActions.viewCreateDeckForm(BrowserDeckActions.java:20)\n\tat com.jll.stickrmgr.stepdefinitions.DeckMgmt.the_system_creates_a_valid_empty_deck(DeckMgmt.java:53)\n\tat ✽.Then The system creates a valid empty deck(resources/deckmagmt.feature:13)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"id\",\"selector\":\"f_name\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027MacBook-Pro-de-Jose.local\u0027, ip: \u0027192.168.1.38\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.4\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: unknown\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///var/folders/bj/yg6lpc3570x4b1vm7844bk9h0000gn/T/anonymous5304678106433035670webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10770)\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///var/folders/bj/yg6lpc3570x4b1vm7844bk9h0000gn/T/anonymous5304678106433035670webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10779)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///var/folders/bj/yg6lpc3570x4b1vm7844bk9h0000gn/T/anonymous5304678106433035670webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///var/folders/bj/yg6lpc3570x4b1vm7844bk9h0000gn/T/anonymous5304678106433035670webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12666)\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///var/folders/bj/yg6lpc3570x4b1vm7844bk9h0000gn/T/anonymous5304678106433035670webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12608)\n",
  "status": "failed"
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
  "duration": 77289480,
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
  "location": "DeckMgmt.i_request_to_create_a_deck_with_name(DeckDTO)"
});
formatter.result({
  "duration": 46465701,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_name_is_invalid()"
});
formatter.result({
  "duration": 48473583,
  "error_message": "java.lang.IllegalArgumentException: [Assertion failed] - this expression must be true\n\tat org.springframework.util.Assert.isTrue(Assert.java:68)\n\tat org.springframework.util.Assert.isTrue(Assert.java:80)\n\tat com.jll.stickrmgr.stepdefinitions.DeckMgmt.the_name_is_invalid(DeckMgmt.java:59)\n\tat ✽.But The name is invalid(resources/deckmagmt.feature:17)\n",
  "status": "failed"
});
formatter.match({
  "location": "DeckMgmt.the_system_refuses_the_create_action()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 54942259,
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
  "location": "DeckMgmt.i_request_to_remove_a_deck_with_name(DeckDTO)"
});
formatter.result({
  "duration": 55171679,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_deck_exists_and_request_confirmation()"
});
formatter.result({
  "duration": 42279183,
  "error_message": "java.lang.IllegalArgumentException: [Assertion failed] - this expression must be true\n\tat org.springframework.util.Assert.isTrue(Assert.java:68)\n\tat org.springframework.util.Assert.isTrue(Assert.java:80)\n\tat com.jll.stickrmgr.stepdefinitions.DeckMgmt.the_deck_exists_and_request_confirmation(DeckMgmt.java:75)\n\tat ✽.And The deck exists and request confirmation(resources/deckmagmt.feature:25)\n",
  "status": "failed"
});
formatter.match({
  "location": "DeckMgmt.the_system_removes_the_deck()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeckMgmt.a_confirmation_message_is_provided()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 44338941,
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
  "location": "DeckMgmt.i_request_to_remove_a_deck_with_name(DeckDTO)"
});
formatter.result({
  "duration": 42042313,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.the_deck_doesnt_exist()"
});
formatter.result({
  "duration": 40015115,
  "status": "passed"
});
formatter.match({
  "location": "DeckMgmt.a_warning_message_is_provided()"
});
formatter.result({
  "duration": 41732706,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.jll.stickrmgr.stepdefinitions.DeckMgmt.a_warning_message_is_provided(DeckMgmt.java:99)\n\tat ✽.Then A warning message is provided(resources/deckmagmt.feature:32)\n",
  "status": "pending"
});
});