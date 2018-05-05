Feature: checking facebook login functionality

Scenario: User is able to login to Facebook page
	Given User at facebook homepage
	When User enter Username
	And User enter password
	Then click on login button
	And Suser should be at his page