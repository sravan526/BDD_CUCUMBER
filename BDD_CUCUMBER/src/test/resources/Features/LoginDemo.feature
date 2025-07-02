Feature: Test Login Functionality
	@smoketest
  Scenario Outline: Check login is successfull with Valid credentials
    Given Browser is opened1
    And user is in login page1
    When user enter <username> and <password1>
    And user clicks on login button
    Then user is navigated to homepage1

    Examples:
    |username|password1|
    |Raghav|12345|
    |Ele|12345|