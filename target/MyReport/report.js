$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/featureFiles/BootCa.feature");
formatter.feature({
  "line": 1,
  "name": "signup for yelp account",
  "description": "As anew yelp user \r\n     I should be able to sign up",
  "id": "signup-for-yelp-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "cheking yelp signup functionality",
  "description": "",
  "id": "signup-for-yelp-account;cheking-yelp-signup-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user lands on yelp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on Signup button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter \"\u003cfirstname\u003e\" \"\u003cvalue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enter \"\u003clastname\u003e\" \"\u003cvalue2\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter \"\u003cemai\u003e\" \"\u003cvalue3\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter \"\u003cpass\u003e\" \"\u003cvalue4\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enter \"\u003czip\u003e\" \"\u003cvalue5\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user select month",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user select date",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user select year",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Signup buttonn",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 20,
      "value": "#\tThen get all links"
    },
    {
      "line": 21,
      "value": "#\tThen user take screenshot"
    },
    {
      "line": 22,
      "value": "#"
    }
  ],
  "line": 23,
  "name": "",
  "description": "",
  "id": "signup-for-yelp-account;cheking-yelp-signup-functionality;",
  "rows": [
    {
      "cells": [
        "firstname",
        "value",
        "lastname",
        "value2",
        "emai",
        "value3",
        "pass",
        "value4",
        "zip",
        "value5"
      ],
      "line": 24,
      "id": "signup-for-yelp-account;cheking-yelp-signup-functionality;;1"
    },
    {
      "cells": [
        "firstn",
        "Bantamelak",
        "lastna",
        "Tafete",
        "email",
        "tafete21@gmail.com",
        "password",
        "fasika2112",
        "zipp",
        "20887"
      ],
      "line": 25,
      "id": "signup-for-yelp-account;cheking-yelp-signup-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16969560054,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "cheking yelp signup functionality",
  "description": "",
  "id": "signup-for-yelp-account;cheking-yelp-signup-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user lands on yelp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on Signup button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter \"firstn\" \"Bantamelak\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enter \"lastna\" \"Tafete\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter \"email\" \"tafete21@gmail.com\"",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enter \"password\" \"fasika2112\"",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enter \"zipp\" \"20887\"",
  "matchedColumns": [
    8,
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user select month",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user select date",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user select year",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Signup buttonn",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.homepage()"
});
formatter.write(" User on the Home page");
formatter.result({
  "duration": 840432284,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_signup()"
});
formatter.result({
  "duration": 4336812735,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstn",
      "offset": 12
    },
    {
      "val": "Bantamelak",
      "offset": 21
    }
  ],
  "location": "StepDefinition.enter_all_credential(String,String)"
});
formatter.result({
  "duration": 250887554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lastna",
      "offset": 12
    },
    {
      "val": "Tafete",
      "offset": 21
    }
  ],
  "location": "StepDefinition.enter_all_credential(String,String)"
});
formatter.result({
  "duration": 156162389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 12
    },
    {
      "val": "tafete21@gmail.com",
      "offset": 20
    }
  ],
  "location": "StepDefinition.enter_all_credential(String,String)"
});
formatter.result({
  "duration": 227028486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 12
    },
    {
      "val": "fasika2112",
      "offset": 23
    }
  ],
  "location": "StepDefinition.enter_all_credential(String,String)"
});
formatter.result({
  "duration": 309074561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zipp",
      "offset": 12
    },
    {
      "val": "20887",
      "offset": 19
    }
  ],
  "location": "StepDefinition.enter_all_credential(String,String)"
});
formatter.result({
  "duration": 168434811,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.month()"
});
formatter.write("Month Selected Properly");
formatter.result({
  "duration": 285776825,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.day()"
});
formatter.write("user set the Date here");
formatter.result({
  "duration": 363091799,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.year()"
});
formatter.write("User Select year succesfully");
formatter.result({
  "duration": 949628534,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_signupp()"
});
formatter.write("User clicked the Sign up button");
formatter.write("Now the value is correct and all finished successfully!!");
formatter.result({
  "duration": 194172988,
  "status": "passed"
});
formatter.write("Finished scenario");
formatter.after({
  "duration": 1824844312,
  "status": "passed"
});
});