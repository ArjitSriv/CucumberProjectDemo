

@SmokeScenario
Feature: Test Login Functionality

  Scenario: Verify user should be able to add to cart and it should be visible in Cart

    Given user login using valid "User Credentials"
    When user click on Add To Cart
    And user click on Cart Icon