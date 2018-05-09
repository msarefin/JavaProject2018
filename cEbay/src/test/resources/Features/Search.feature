Feature: Testing eBay shopping functionality

@smoke
Scenario Outline: Uses shall be able to search products, add to cart and checkout

Given user is at eBay homepage
Then user enters "<Search>" "<svalue>"
Then user use click on "<SearchBtn>" 
Then user is in search result page
Then user mouse over "<sorted>"
Then user clicked on "<newlist>"
Then user clickd on "<FirstItem>"

Examples:
|Search|svalue|SearchBtn|sorted|newlist|FirstItem|
|searchBar|Xbox 360|SearchBtn|sort|newlylisted|

