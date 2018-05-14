Feature: Testing the functionality of the United Airlines website 

@smoke 
Scenario Outline: User is able to search and purchase tickes online 

	Given User is in the homepage
	Then User clicks "<RoundTrip>"
	Then User enters "<from>" "<frmvalue>"
	Then User clicks "<fitem>"
	Then User enters "<to>" "<tovalue>"
	Then User clicks "<titem>"
	Then User clicks "<departdate>" 
	Then User clicks "<dptdate>"
	Then User clicks "<Returendate>"
	Then User clicks "<rtndate>"
	Then User clicks "<travelers>"
	Then User clicks "<incadult>"
	Then User clicks "<decadult>"
	Then User clicks "<incsenior>"
	Then User clicks "<decsenior>"
	Then User clicks "<incchild17>"
	Then User clicks "<decchild17>"
	Then User clicks "<incchild14>"
	Then User clicks "<decchild14>"
	Then User clicks "<incchild11>"
	Then User clicks "<decchild11>"
	Then User clicks "<incchild4>"
	Then User clicks "<decchild4>"
	Then User clicks "<incinf2>"
	Then User clicks "<decinf2>"
	Then User clicks "<incinfantlp>"
	Then User clicks "<decinfantlp>"
	
	Then User selects "<cabinType>" "<ctvalue>"
	Then User clicks "<nonstop>"
	Then User clicks "<Search>"
	Then User is in Search Result
	
	Examples:
	|RoundTrip|from|frmvalue|fitem		|to|tovalue	|titem	|departdate	|dptdate|Returendate|rtndate|travelers|incadult|decadult|incsenior|decsenior|incchild17|decchild17|incchild14|decchild14|incchild11|decchild11|incchild4|decchild4|incinf2		|decinf2	|incinfantlp	|decinfantlp	|cabinType|ctvalue	|nonstop|Search|
	|Roundtrip|from|lax		|fromitem	|to|bos		|toitem	|deptdate	|ddate	|retdate	|rdate	|travelsel|adultinc|adultdec|seniorinc|seniordec|child17inc|child17dec|child14inc|child14dec|child11inc|child11dec|child4inc|child4dec|infant2inc	|infant2dec	|infantlapinc	|infantlapdec	|cabinType|Business or First|nonstop	|search|