#Author
#Date
#Description

Feature: feature to test login functionality

 @smoketest
  Scenario: Check login is successful with valid credentials
 
    Given user is in login page
    When user enter username and password
    And Clicks on login button
    Then user is navigated to the home page
