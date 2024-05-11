Feature: User Login

 

  @practice1
  Scenario: Successful Login
    Given User is on the login page
    When User enters valid credentials
    And User clicks on login button
    Then User should be redirected to the home page

  @practice1
  Scenario: Check Home Page
   Given User is on the login page
    When User enters valid credentials
    And User clicks on login button
    Then User should be redirected to the home page
    Given user is on home page
    When user enters firstname and lastname
    Then user should be able to see text
