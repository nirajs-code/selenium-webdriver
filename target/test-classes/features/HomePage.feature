Feature: Google Search

  @regression
  Scenario: Test search from Google Home page
    Given Search the "Hello" on home page
    Then I verify the search result