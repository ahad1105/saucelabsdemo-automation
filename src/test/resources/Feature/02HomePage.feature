Feature: User is checking the homepage product selection functionality

  Scenario: Successful login and adding an item to the cart
    Given user successfully navigates to the homepage
    When user clicks on the sorting filter
    And user sorts items from low to high
    And user selects a particular item from the list
    And user clicks on the add to cart button
    Then user is navigated to the cart