Feature: User is checking the login functionality
  Scenario: Successful login
    Given user navigates to the login page
    When user enters a valid username
    And enters a valid password
    And user clicks on login button
    Then user successfully navigates to the homepage