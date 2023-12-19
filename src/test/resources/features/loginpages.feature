Feature: Login Page test cases

  @author-JDL @smoke
  Scenario: Verify user should navigate to login page successfully
    Given   User is on the Home Page
    When     User click on the login link
    Then    User verify the text Welcome, Please Sign In!

  Scenario: Verify the error message within valid credentials
    Given   User is on the Home Page
    When     User click on login link
    And     User enter password
    And     User click on Login Button
    Then    User verify the error message

  Scenario: Verify the user should login successfully with valid credentials
    When     User click on login link
    And     User enter password
    And     User click on Login Button
    Then    User verify the display text of  LogOut link

  @author-JDL @sanity @smoke @regression
  Scenario: Verify the user should LogOut successfully
    Given   User is on the Home Page
    When     User click on login link
    And     User enter password
    And     User click on Login Button
    And     User click on LogOut Link
    Then    User verify the display text of Login Link