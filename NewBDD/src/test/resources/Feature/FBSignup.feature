Feature: This is for facebook signup user story 

@smoke
Scenario Outline: user should be able to signup to facebook 
	Given user is in facebook site 
	Then user is entering "<Fname>" "<Fvalue>"
	Then user is entering "<Lname>" "<Lvalue>"
	
	
	Examples:
	|Fname|Fvalue|Lname|Lvalue|
	|Firstname|Alexi |Lastname|Smith |