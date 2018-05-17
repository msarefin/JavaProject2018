Feature: US102154 As a user I want to be able to signup as a new client So that I can create a new citibank account 


@Smoke 
Scenario Outline: Sign up a new user, User fills in about you fields 
	Given user is on landing page 
	When user clicks open an account 
	Then user select state 
	Then user will select account option 
	Then user clicked basic banking package account 
	And user clicked apply Now button 
	Given user is at tell us about yourself page 
	Then i am entering "//input[@id='acs-1040']" "<fname>" 
	Then i am entering "//input[@id='acs-1042']" "<mname>" 
	And i am entering "//input[@id='acs-1044']" "<lname>" 
	Then i am selecting ".//*[@id='acs-1046']" "Sr." 
	Then i am entering "//input[@id='acs-1048']" "<email>" 
	Then i am entering "//input[@id='acs-1050']" "<num>" 
	Then i am entering "//input[@id='acs-1057']" "<addy>" 
	Then I am clicking "//label[@for='acs-1087']" 
	Then I am clicking "//label[contains(@for,'acs-1131')]" 
	Then I am clicking "//label[contains(@for,'acs-1140')]" 
	Then i am selecting "//select[@id='acs-1153']" "Driver's License" 
	Then i am selecting "//select[@id='acs-1167']" "United States" 
	Then i am entering "//input[@id='acs-1170']" "<birth>" 
	Then i am entering "//input[@id='acs-1174']" "<ssn>" 
	Then  I am clicking "//label[@for='acs-1206']" 
	Then  I am clicking "//label[@for='acs-1216']" 
	Then i am entering "//input[@id='acs-1239']" "<mmname>" 
	Then i am entering "//input[contains(@id,'acs-1242')]" "<eschool>" 
	Then i am entering "//input[@id='acs-1544']" "<fname>" 
	Then i am entering "//input[@id='acs-1545']" "<lname>" 
	Then i am entering "//input[@id='acs-1546']" "<tddate>" 
	Then I am clicking "//label[@for='acs-1567']" 
	And I am clicking ".//*[@id='sfc-form']/div[22]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/button" 
	And I am clicking "//button[@aria-describedby='2-navmsg-descby']" 
	
	
	Examples: 
		|fname      |mname  |lname	|email				|num		|addy			                  |birth		| ssn		|mmname|eschool		|tddate		|
		|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here st vienna va 22180    |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here st    |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
		#	|Lamar		|J		|Dailey |lj.dailey@yahoo.com|2406717716 |12354 here     |03/09/1990	|432-34-9087|Claire|White School|05/12/2018	|
