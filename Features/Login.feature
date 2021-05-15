Feature: NopCommerce Admin Login Functionality

  @Temp
  Scenario: Successful Login with valid credentials
    Given user has launched the chrome browser
    When user opens the url "https://admin-demo.nopcommerce.com/login"
    And user enters the Email as "admin@yourstore.com" and Password as "admin"
    And clicks on Login
    Then page title should be "Dashboard / nopCommerce administration"
    When user clicks on Logout link
    Then page title should be "Your store. Login"
    And close the browser

 Scenario Outline: Successful Login with different set of credentials
    Given user has launched the chrome browser
    When user opens the url "https://admin-demo.nopcommerce.com/login"
    And user enters the Email as "<email>" and Password as "<password>"
    And clicks on Login
    Then page title should be "Dashboard / nopCommerce administration"
    When user clicks on Logout link
    Then page title should be "Your store. Login"
    And close the browser

   Examples:
   |email | password |
   |admin@yourstore.com | admin |
   |admin123@yourstore.com | admin123 |