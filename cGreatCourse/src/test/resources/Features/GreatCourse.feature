Feature: Testing the shopping feature of the great course 

@smoke
Scenario Outline: User shall be able to purchase product 

	Given User is in the home page
	Then User clicks on "<SpecialSale>"
	Then User is in On sale Page
	
	
	Examples:
	|SpecialSale|
	|spSale|