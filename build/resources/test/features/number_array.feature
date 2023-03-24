@stories
Feature: Log in to the tasks evalart platform, calculate the position in the array
  Background:
    Given I want to log in to the platform
  @SelectPosition
  Scenario: Select position in the array
    When i calculate position of the number in the array in all cycles
    Then i should see the hash

