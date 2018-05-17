@fail
Feature: this is for Facebook sign up user story 


@Smoke1
Scenario Outline: User should able to sign up to Facebook 
	Given i am at Facebook page 
	Then i am entering "<Fname>" "<Fvalue>" 
	Then i am entering "<Lname>" "<Lvalue>" 
	
	
	Examples: 
		|Fname    |Fvalue|Lname   |Lvalue|
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |
		

@P1		
Scenario Outline: User should not able to sign up to Facebook
	Given i am at Facebook page 
	Then i am entering "<Fname>" "<Fvalue>" 
	Then i am entering "<Lname>" "<Lvalue>"
	Then you will see error message
	
	
	Examples: 
		|Fname    |Fvalue|Lname   |Lvalue|
		|firstname|stupid   |lastname| messi       |
		|firstname|Cristina  |lastname| Ronaldo    |