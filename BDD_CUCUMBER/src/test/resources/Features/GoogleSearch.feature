Feature: feature to test google search page
	@smoketest
  Scenario: Validate to serach google serach page
    Given Browser is open
    And User is google serach page
    When User enters a text in search box
    And hits enter button
    Then user is navigated to search results