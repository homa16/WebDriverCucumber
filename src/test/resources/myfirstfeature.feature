Feature: A simple google test with firefox/chrome

  Scenario: Going to google and asserting on the title
    Given I have initilized the driver
    And I am on google.com homepage
    Then I assert on the title
    And I quit the driver
