Feature: Register page test cases

  @sanity @regression
  Scenario: Verify User should navigate to Register Page successfully
    Given   User is on Home Page
    When     Click on Register Link
    Then    User Verify the Register text

  @smoke @regression
  Scenario: User Verify FirstName LastName Email Password And ConfirmPassword Fields are Mandatory
    Given   User is on Home Page
    When     Click on Register button
    Then    User verify the first name error message  First name is required.
    Then    User Verify the last name error message   Last name is required.
    Then    User Verify the email error message Email is required.
    Then    User Verify the password error message Password is required.
    Then    User Verify the Confirm password error message Confirm Password is required.


  @regression
  Scenario: Verify User Should Create Account Successfully
    Given   User is on Home Page
    When     Click on Register Link
    And     User Select gender Female
    And     User Enter firstname
    And     User Enter lastname
    And     User Select day
    And     User Select month
    And     User Select year
    And     User Enter email
    And     User Enter password
    And     User Enter Confirm Password
    And     User Click on REGISTER button
    Then    User Verify message Your registration completed