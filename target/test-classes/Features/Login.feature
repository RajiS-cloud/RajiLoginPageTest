Feature: Guru99 Bank Login Page
  Scenario: Navigate to the Login Page URL and enter username and password
    Given I land on the Login page url
    When  I enter the username and password
    Then  I can land on homepage
    And I logout from homepage

