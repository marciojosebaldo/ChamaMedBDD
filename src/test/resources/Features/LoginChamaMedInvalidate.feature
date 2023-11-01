Feature: feature to fail in test the login page ChamaMed

  Scenario: Invalidate the login working
    Given page login ChamaMed is open
    And user is on login page ChamaMed
    When user enters the matricula and senha wrong
    And hits the button login
    Then user cannot enter the home page