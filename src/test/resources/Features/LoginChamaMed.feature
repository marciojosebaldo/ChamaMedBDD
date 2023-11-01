Feature: feature to test the login page ChamaMed

  Scenario: Validate the login is working
    Given page login is open
    And user is on login page ChamaMed applications
    When user enters the matricula and senha
    And press login
    Then user is navigated to home page