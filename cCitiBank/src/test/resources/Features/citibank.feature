Feature: Registering on citibank 

@smoke 
Scenario Outline: User Shall be able to signup / create a new account 

	Given User is at LandingPage 
	
	Then user clicks "<OpenAcc>" 
	Then user selects "<StateSelector>" "<statevalue>" 
	Then user clicks "<continue>"
	Then user selects "<accountTyp>" "<accTypvalue>"
	Then user clicks "<getStarted>"
	Then user clicks "<citiGold>"
	Then user clicks "<citigldchksav>"
	Then user clicks "<contcitiGldchksav>"
	Then user selects "<title>" "<titlevalue>"
	Then user enters "<fname>" "<fnvalue>"
	Then user enters "<mname>" "<mnvalue>"
	Then user enters "<lname>" "<lnvalue>"
	Then user selects "<suffex>" "<sfxvalue>"
	Then user enters "<email>" "<emailvalue>"
	Then user enters "<phoneNumber>" "<phonevalue>"
	Then user enters "<address>" "<addressvalue>"
	Then user clicks "<firstSuggest>"
	Then user clicks "<ratecont>"
	Then user enters "<unit>" "<unitvalue>"
	Then user clicks "<addressyes>" 
	Then user clicks "<mil>" 
	Then user clicks "<moneyintno>"
	Then user selects "<idtype>" "<idValue>"
	Then user enters "<idNumver>" "<idvalue>"
	Then user selects "<state>" "<stateValue>"
	Then user enters "<issuedate>" "<datevalue>" 
	Then user enters "<expdate>" "<expvalue>"
	Then user selects "<citizen>" "<citizenvalue>"
	Then user enters "<DOB>" "<DOBvalue>"
	Then user enters "<ssn>" "<ssnvalue>"
	Then user clicks "<consno>"
	Then user clicks "<citibankemplno>"
	Then user enters "<mothermaden>" "<mmadenvalue>"
	Then user enters "<elementry>" "<elvalue>"
	Then user enters "<sigfname>" "<sigfnvalue>"
	Then user enters "<siglname>" "<siglnvalue>"	
	Then user enters "<todaydate>" "<todateValue>"
	Then user checks "<legal>"
	Then user checks "<termgold>"
	Then user clicks "<goldtermconf>"
	Then user clicks "<goldnext>"
	
	
	
	Examples: 
	
		|OpenAcc	|StateSelector	|statevalue	|continue|accountTyp|accTypvalue|getStarted	|citiGold|citigldchksav		|contcitiGldchksav	|title|titlevalue	|fname|fnvalue	|mname|mnvalue	|lname|lnvalue	|suffex|sfxvalue|email|emailvalue	|phoneNumber|phonevalue|address|addressvalue|firstSuggest|ratecont	|unit|unitvalue	|addressyes	|mil|moneyintno	|idtype|idValue			|idNumver|idvalue	|state|stateValue	|issuedate|datevalue	|expdate|expvalue 	|citizen|citizenvalue	|DOB|DOBvalue	|ssn|ssnvalue	|consno|citibankemplno	|mothermaden|mmadenvalue|elementry		|elvalue				|sigfname|sigfnvalue	|siglname|siglnvalue|todaydate	|todateValue|legal		|termgold	|goldtermconf|goldnext|
		|openAccount|StateSelect	|NY			|continue|accTyp	|Banking	|GetStated	|citiGold|cgichksave		|optcontinue		|title|Mr.			|fname|Alexi	|mname|d		|lname|king		|suffex|Sr.		|email|alex@king.com|phone		|5554546541|address|300 longwood|firstSuggest|ratescont	|unit|25B		|addyes		|mil|monintno	|idtype|Driver's License|IdNumber|123456789	|state|New York		|issuedate|03/05/2012	|expdate|03/05/2019	|citizen|United States	|DOB|05/05/1975	|ssn|944859121	|consno|notemployee		|mommaden	|linda		|elementrysch	|international school	|sigfname|alexi			|siglname|king		|todaydate	|			|legalaccep	|goldTerms	|goldtermconf|goldnext|