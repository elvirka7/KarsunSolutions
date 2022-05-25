Feature: As a user, I should be able to apply for job successfully.

  Scenario: Verify user can search for job
    Given user on the main page
    When the user clicks the "Careers" module
    Then user enters "Software Engineer in Test" in search box
    And user clicks on "Find Jobs" button
    When user enters "Software Engineer in Test" in search box
    And user clicks the search button
    Then user clicks on the SDET job position link
  And user clicks on apply button
    And user enters email into email input box
    Then user clicks the next button



