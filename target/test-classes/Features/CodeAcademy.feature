@tag
Feature: feature to test google search

  @tag1
  Scenario: Validate CodeAcademy search is working
    Given browser is open
    And User goes to Codeacademy page
    When User enters a text in a search box
    And User waits 5 seconds
    Then User is navigated to result
    And User checks for 6 seconds
