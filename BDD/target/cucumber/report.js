$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/FB.feature");
formatter.feature({
  "line": 1,
  "name": "checking facebook login functionality",
  "description": "",
  "id": "checking-facebook-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: User is able to login to Facebook page"
    },
    {
      "line": 5,
      "value": "#\tGiven User at facebook homepage"
    },
    {
      "line": 6,
      "value": "#\tWhen User enter username \"\tuname\""
    }
  ],
  "line": 9,
  "name": "User is able to login to Facebook page",
  "description": "",
  "id": "checking-facebook-login-functionality;user-is-able-to-login-to-facebook-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User at facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter username \"\u003cuname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter password \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 14,
      "value": "#\tAnd user should be at his page"
    }
  ],
  "line": 16,
  "name": "",
  "description": "",
  "id": "checking-facebook-login-functionality;user-is-able-to-login-to-facebook-page;",
  "rows": [
    {
      "cells": [
        "uname",
        "pass"
      ],
      "line": 17,
      "id": "checking-facebook-login-functionality;user-is-able-to-login-to-facebook-page;;1"
    },
    {
      "cells": [
        "username@email.com",
        "password"
      ],
      "line": 18,
      "id": "checking-facebook-login-functionality;user-is-able-to-login-to-facebook-page;;2"
    },
    {
      "cells": [
        "thisismyname@email.com",
        "passtheword"
      ],
      "line": 19,
      "id": "checking-facebook-login-functionality;user-is-able-to-login-to-facebook-page;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13602181211,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User is able to login to Facebook page",
  "description": "",
  "id": "checking-facebook-login-functionality;user-is-able-to-login-to-facebook-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User at facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter username \"username@email.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter password \"password\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "GUIStepDefination.fb()"
});
formatter.result({
  "duration": 165016354,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username@email.com",
      "offset": 21
    }
  ],
  "location": "GUIStepDefination.user(String)"
});
formatter.result({
  "duration": 1458462727,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    }
  ],
  "location": "GUIStepDefination.pass(String)"
});
formatter.result({
  "duration": 1161455006,
  "status": "passed"
});
formatter.match({
  "location": "GUIStepDefination.clickLogin()"
});
formatter.result({
  "duration": 5072048572,
  "status": "passed"
});
formatter.after({
  "duration": 3214002858,
  "status": "passed"
});
formatter.before({
  "duration": 7679538045,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User is able to login to Facebook page",
  "description": "",
  "id": "checking-facebook-login-functionality;user-is-able-to-login-to-facebook-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User at facebook homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter username \"thisismyname@email.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter password \"passtheword\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "GUIStepDefination.fb()"
});
formatter.result({
  "duration": 15190154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thisismyname@email.com",
      "offset": 21
    }
  ],
  "location": "GUIStepDefination.user(String)"
});
formatter.result({
  "duration": 1426975608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passtheword",
      "offset": 21
    }
  ],
  "location": "GUIStepDefination.pass(String)"
});
formatter.result({
  "duration": 1200066441,
  "status": "passed"
});
formatter.match({
  "location": "GUIStepDefination.clickLogin()"
});
formatter.result({
  "duration": 2974376980,
  "status": "passed"
});
formatter.after({
  "duration": 3376254615,
  "status": "passed"
});
});