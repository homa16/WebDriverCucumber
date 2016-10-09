Feature: A simple google homepage test

  Scenario: Asserting the title of google homepage
    Given I initilize the firefox browser
    And I am on google homepage
    Then I validate the title of the page
    And I quit the browser
