Feature: HomeElements

  Background:
    Given User is on the login page
    When User enters valid credentials
    And User clicks on login button
    Then User should be redirected to the home page
    
 @practice1
  Scenario: Check radio button
    Given User should be on home page
    When User clicks on radio button
    Then radio button should be enabled

 @practice1
   Scenario: Check checkbox
   	Given User should be on home page
    When User clicks on checkbox button
    Then checkbox  should be select
 
  @practice1
   Scenario: check dropdown for skills
   	Given User should be on home page
    When User clicks on dropdown and select skill
    Then skill should be displayed
    
   @practice1
   Scenario: select date from dropdown
   	Given User should be on home page
   	When user should select date "15 august 2022" from dropdwon
   	Then user should be able to see date
   
   