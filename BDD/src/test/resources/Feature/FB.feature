Feature: checking facebook login functionality


#Scenario: User is able to login to Facebook page
#	Given User at facebook homepage
#	When User enter username "	uname"
	
@smoke
Scenario Outline: User is able to login to Facebook page
	Given User at facebook homepage
	When User enter username "<uname>"
	And User enter password "<pass>"
	Then click on login button
#	And user should be at his page

Examples:
|uname|pass|
|username@email.com|password|
|thisismyname@email.com|passtheword|