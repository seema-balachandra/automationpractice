@Cart
Feature: Shopping Cart
  As a user I want to add item to shopping cart
  So that I can proceed to purchase

 
  Scenario: Add highest priced item to the cart in Woman Dress category
    	Given I am on the home page of the application
    	And I click on Sign in link
  	  And I fill my email and password
  	  And I click on Sign in button
    	And I click on DRESSES category
    	And I add most expensive item to the cart
    	And I click on Proceed to checkout
    	And I click on Signout button
    	When I logged in again with the same user
    	Then I should see the item in the cart