@Login
Feature: Login and Logout
  As a user I want to Login and Logout from the application 
  So that I can securely use my account.

 
  Scenario: Login into automation practice
    Given I am on the home page of the application
  	And I click on Sign in link
  	And I fill my email and password
  	When I click on Sign in button
  	Then I should see the welcome text
  	
  Scenario: Logout from the automation practice
  	Given I am on the home page of the application
  	And I click on Sign in link
  	And I fill my email and password
  	And I click on Sign in button
  	When I click on Signout button
  	Then I should see the Sign In text

  	