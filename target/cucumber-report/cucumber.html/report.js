$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "",
  "id": "register",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7662568200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should create account successfully",
  "description": "",
  "id": "register;user-should-create-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on sign up link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to account page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter below details on account page",
  "rows": [
    {
      "cells": [
        "Maria",
        "Smith"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on continue button account page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on female tab",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter email \"random email\" into the email field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password into password \"Password@123\"field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter mobile number \"7852658932\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select date of birth from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter below personal details",
  "rows": [
    {
      "cells": [
        "4,CrossWay",
        "Slough",
        "Reading",
        "OX189FG"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on continue tab",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I click on marketing communications check box",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on terms and conditions check box",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on create account tab on sign up page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should be able to create account successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 430493700,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iClickOnSignUpLink()"
});
formatter.result({
  "duration": 1197723300,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iShouldNavigateToAccountPage()"
});
formatter.result({
  "duration": 163600,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iEnterBelowDetailsOnAccountPage(DataTable)"
});
formatter.result({
  "duration": 3565094800,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iClickOnContinueButtonAccountPage()"
});
formatter.result({
  "duration": 519018700,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iClickOnFemaleTab()"
});
formatter.result({
  "duration": 790799500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random email",
      "offset": 15
    }
  ],
  "location": "AccountSteps.iEnterEmailIntoTheEmailField(String)"
});
formatter.result({
  "duration": 951584500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password@123",
      "offset": 32
    }
  ],
  "location": "AccountSteps.iEnterPasswordIntoPasswordField(String)"
});
formatter.result({
  "duration": 915150600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7852658932",
      "offset": 23
    }
  ],
  "location": "AccountSteps.iEnterMobileNumber(String)"
});
formatter.result({
  "duration": 650109900,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iSelectDateOfBirthFromDropdown()"
});
formatter.result({
  "duration": 1353678200,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iEnterBelowPersonalDetails(DataTable)"
});
formatter.result({
  "duration": 2476895400,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iClickOnContinueTab()"
});
formatter.result({
  "duration": 2304616500,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iClickOnMarketingCommunicationsCheckBox()"
});
formatter.result({
  "duration": 2076928200,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iClickOnTermsAndConditionsCheckBox()"
});
formatter.result({
  "duration": 129284800,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iClickOnCreateAccountTabOnSignUpPage()"
});
formatter.result({
  "duration": 2136900100,
  "status": "passed"
});
formatter.match({
  "location": "AccountSteps.iShouldBeAbleToCreateAccountSuccessfully()"
});
formatter.result({
  "duration": 39100,
  "status": "passed"
});
formatter.after({
  "duration": 823401000,
  "status": "passed"
});
});