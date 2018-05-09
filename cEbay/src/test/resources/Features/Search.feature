Feature: Testing eBay shopping functionality

@smoke
Scenario Outline: Uses shall be able to search products, add to cart and checkout

Given user is at eBay homepage
Then user enters "<Search>" "<svalue>"
Then user use click enter

Examples:
|Search|svalue|
|searchBar|Xbox 360|

