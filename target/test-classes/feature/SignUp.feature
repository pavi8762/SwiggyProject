@Search
Feature: Sign up Functionality in Swiggy Website

  @Sanity
  Scenario: Provide the SignUp Functions to Swiggy Users
    Given The user is on the Swiggy Home Page
    When User Click on SignUp
    Then User should be redirected to SignUp Page

  @Sanity
  Scenario Outline: Provide the SignUp Function to Swiggy Users
    Given The user is already on the SignUp page
    When User enters "<mobile>" "<username>" "<email>" "<password>"
    And User Click Continue button
    Then User should be able to SignUp

    Examples: 
      | mobile     | username | email         | password |
      | 1234567897 | Shaun    | Shaun@xyz.com | abcd1234 |
