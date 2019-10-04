@signup
Feature: Signup 
  I want to use this template for my feature file
  
  As a user
  I want to signup for the application
  So that I can manage my profile

  
  Scenario: Successfull signup
  	Given I am on the home page of the application
  	And I click on Sign in link
  	And I enter my emailid
  	And I click on Create an account button
  	And I enter my personal details
  	And I enter my address details
  	And I enter my phone number
  	When I click on Register
  	Then I should successfully navigated to my account page
  	And I should see the welcome text
   