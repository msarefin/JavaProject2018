Feature: Facebook signup user story

@smoke 
Scenario Outline: User shall be able to signup to Facebook 

	Given User is at Facebook homepage
	Then User enters "<Fname>" "<FNvalue>"
	Then User enters "<Lname>" "<LNvalue>"
	Then User enters "<email>" "<emvalue>"
	Then User enters "<reemail>" "<remvalue>"
	Then User enters "<pass>" "<pvalue>"
	Then User enters DOB "<Month>" "<mData>"
	Then User enters DOB "<Day>" "<dData>"
	Then User enters DOB "<Year>" "<yData>"
	Then User eneters gender "<Male>"
	Then User clicks on signup
	
	Examples:
	|Fname|FNvalue|Lname|LNvalue|email|emvalue|reemail|remvalue|pass|pvalue|Month|mData|Day|dData|Year|yData|Male|
	|FirstName|Alexi|LastName|Smith|Email|Alexi@smaith.com|Reemail|Alexi@smaith.com|Pass|abc123|bmonth|Jan|bday|30|byear|1980|gmale|