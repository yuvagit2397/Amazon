Feature: Amazon product search
Scenario: searching mobiles
Given user is on amazon search page
And user enters searchterm "iphones"
Then user get the name and price of the products
