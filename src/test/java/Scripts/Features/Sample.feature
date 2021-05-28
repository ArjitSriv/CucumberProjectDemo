#Author
#Date


@SmokeScenario
Feature: Feature to Test Login Functionality

  Scenario: : Check login is successful with valid credentials

    Given user is on login page
    When user enters username and password
    And clicks on login button

    And user is navigated to the the homepage


    Scenario Outline:

    Examples:
    |Username|password|
    |standard_user|secret_sauce|