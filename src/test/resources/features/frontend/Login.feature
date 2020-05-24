Feature: Isomorphic sigin Screen

  @demo
  @sigin
  Scenario: [Login] To verify the user is able to sigin in the application
    Given I am on the sigin page
    When Select the language and location on the welcome page
    Then Click on the member login tab on the top right
    And Click on the "Mukul" and the cursor starts blinking
    And Click on the Password "Vishal"
