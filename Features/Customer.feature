Feature: Add and Search for Customer

  Scenario: Add a new customer
    Given user has launched the chrome browser
    When user opens the url "https://admin-demo.nopcommerce.com/login"
    And user enters the Email as "admin@yourstore.com" and Password as "admin"
    And clicks on Login
    Then user can view the "Dashboard" page
    When user clicks on customers menu
    And click on Add new button
    Then user can view Add new customer page
    When user enters the customer info
    Then click on save button
    Then user can view the confirmation message "The new customer has been added successfully."
    And close the browser