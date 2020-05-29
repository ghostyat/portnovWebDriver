@predefined
Feature: Smoke steps
  
  @predefined4
  Scenario: Steps for searching "Java" in yahoo
    Given I open url "https://www.yahoo.com/"
    Then I should see page title as "Yahoo"
    And element with xpath "//input[@id='header-search-input']" should be present
    Then I type "Java" into element with xpath "//input[@id='header-search-input']"


  