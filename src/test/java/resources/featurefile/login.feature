Feature: Login Functionality

  As a user I should be able to login successfully

  @smoke @regression
  Scenario: User should login successfully
    Given I am on homepage
    When  I click on login link
    And   I enter username "john@123gmail.com" into username field
    And   I enter password "Password1234" into password field
    And   I click on log in button
    Then  I should be able to login successfully