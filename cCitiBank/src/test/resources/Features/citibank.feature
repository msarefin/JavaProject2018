Feature: Registering on citibank

@smoke
Scenario Outline:User Shall be able to signup / create a new account

Given User is at LandingPage

Then user clicks on "<OpenAcc>"
Then user selects "<AccountType>" "acctypvalue"
Then user 

Examples:

|OpenAcc|
|openAccount|