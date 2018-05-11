Feature: Testing the shopping feature of the great course 

@smoke
Scenario Outline: User shall be able to purchase product 

	Given User is in the home page
	Then User clicks on "<SpecialSale>"
	Then User is in On sale Page
	Then User clicks on "<sort>"
	Then User clicks on "<SortbyAtoZ>"
	Then User clicks on "<secondLNK>"
	Then User clicks on "<DVD>"
	Then User clicks on "<Addtocart>"
	
	Then User clicks on "<ProceedToCheckout>"
	Then User clicks on "<NewCustomer>"
	Then User entered "<email>" "<evalue>"
	Then User clicks on "<continue>"
	Then User entered "<firstName>" "<fnvalue>"
	Then User entered "<lastname>" "<lnvalue>"
	Then User entered "<comp>" "<compvalue>"
	Then User entered "<addrs1>" "<Add1>"
	Then User entered "<addrs2>" "<Add2>"
	Then User entered "<cty>" "<ctyvalue>"
	Then User selected "<country>" "<cntryvalue>"
	
	Then User selected "<state>" "<statevalue>"
	Then User entered "<zip>" "<zipvalue>"
	Then User entered "<Telephone>" "<Telvalue>"
	Then User entered "<fax>" "<faxvalue>"
	Then User entered "<password>" "<passvalue>"
	Then User entered "<confpass>" "<confpasssvalue>"
	Then User clicks on "<shiptoBill>"
	Then User clicks on "<contship>"
	
	
	Examples:
	|SpecialSale|sort	|SortbyAtoZ	|secondLNK|DVD|Addtocart|ProceedToCheckout	|NewCustomer|email|evalue			|continue|firstName	|fnvalue	|lastname	|lnvalue	|comp	|compvalue		|addrs1		|Add1				|addrs2		|Add2	|cty|ctyvalue|country |cntryvalue	|state|statevalue	|zip|zipvalue	|Telephone|Telvalue   	|fax|faxvalue 		|password	|passvalue	|confpass|confpasssvalue|shiptoBill|contship|
	|spSale		|sortby	|sorta2z	|SecondLNK|dvd|addtoct	|checkoutlnk		|newcust	|email|Davi@jones.com	|continue|fname		|Alexander	|lname		|Hamilton	|company|AlexHamilton	|Address1	|123 lakefield rd	|Address2	|Apt 14B|city|New York|country|United States|state|New York			|zip|10024		|telephone|555-355-4578	|fax|555-365-5545	|pass		|passmyword	|confpass|passmyword	|shiptobill|shipmethodcont|