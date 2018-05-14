Feature: Test the search and shopping feature of StoreDemoQA 

@smoke 
Scenario Outline: User shall be able to shop in StoreDemoQA Website 

	Given User at the Homepage
	Then User mouse over "<ProductCategory>" 	
	Then User Clicks "<iphone>"
	Then User Clicks "<iphoneBK>"
	Then User Clicks "<iphoneWh>"
	Then User Clicks "<CheckOut>"
	Then User Prints "<subtotal>"
	Then User Clicks "<Continue>"
	Then User selected "<Country1>" "<Country1value>"
	Then User entered "<username>" "<unamevalue>" 
	Then User entered "<password>" "<passvalue>"
	Then User Clicks "<rememberMe>"
	Then User Clicks "<login>"
	
	Then User Check for "<ErroMsg>" 
	
	Then User entered "<email>" "<emalevalue>" 
	Then User entered "<firstname>" "<fnvalue>"
	Then User entered "<lastname>" "<lnvalue>"
	Then User entered "<address>" "<addvalue>"
	Then User entered "<city>" "<cityvalue>"
	Then User entered "<state>" "<statevalue>"
	Then User selected "<Country>" "<Countryvalue>"
	Then User entered "<postal>" "<postalvalue>"
	Then User entered "<phone>" "<phonevalue>"
	
	Then User Clicks "<ShiptoBill>"


	Examples:
	|ProductCategory|iphone|iphoneBK|iphoneWh|CheckOut|subtotal|Continue|Country1|Country1value|username|unamevalue|password|passvalue|rememberMe|login|ErroMsg|email|emalevalue|firstname|fnvalue|lastname|lnvalue|address|addvalue|city|cityvalue|state|statevalue|Country|Countryvalue|postal|postalvalue|phone|phonevalue|ShiptoBill|
	|ProdCat|iphone|ipbk|ipwh|chkout|Subtot|contnu|Country|USA|user|username|pass|passmyword|remMe|login|errMsg|email|user@email.com|fname|Alexi|lname|smith|address|123 Maple road|city|new york|state|new York|country|USA|postal|10025|phone|5553412525|Shiptobill|