Feature: This is for facebook signup user story 

@smoke
Scenario Outline: user should be able to signup to facebook 
	Given user is in facebook site 
	Then user is entering "<Fname>" "<Fvalue>"
	Then user is entering "<Lname>" "<Lvalue>"
	Then user is entering "<email>" "<emailad>"
	Then user is entering "<reemail>" "<reemailed>"
	Then user is entering "<pass>" "<remailed>"
	
	
	Examples:
	|Fname		|Fvalue	|Lname		|Lvalue|email|emailad		|reemail|reemailed|pass|remailed|
	|Firstname	|Alexi 	|Lastname	|Smith |email|alex@email.com|reemail|alex@email.com|pass|alex@email.com|