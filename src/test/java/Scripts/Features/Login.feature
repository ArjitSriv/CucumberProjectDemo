#Author
#Date


@SmokeScenario
Feature: Test Login Functionality

  Background: user navigate to login page with valid "url"

  Scenario: Verify user is logged in successfully with valid credentials

    Given User is on login page
    When user login using valid "User Credentials"
    Then Menu button should display at the home Page

