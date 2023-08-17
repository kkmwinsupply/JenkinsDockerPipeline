Feature: To test login functionality
 
  Scenario: Check login functionality
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage