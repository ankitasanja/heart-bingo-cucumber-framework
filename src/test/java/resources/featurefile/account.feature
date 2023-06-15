Feature: Register

  @sanity @regression
  Scenario: User should create account successfully
    Given  I am on homepage
    When   I click on sign up link
    Then   I should navigate to account page
    And    I enter below details on account page
    | Maria | Smith |
    And    I click on continue button account page
    And    I click on female tab
    And    I enter email "random email" into the email field
    And    I enter password into password "Password@123"field
    And    I enter mobile number "7852658932"
    And    I select date of birth from dropdown
    And    I enter below personal details
    | 4,CrossWay  | Slough | Reading | OX189FG |
    Then   I click on continue tab
    And    I click on marketing communications check box
    And    I click on terms and conditions check box
    And    I click on create account tab on sign up page
    Then   I should be able to create account successfully


