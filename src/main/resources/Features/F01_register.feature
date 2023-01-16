@smoke
Feature: F01_register | Users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user get to registration page
    When  user select gender type
    And   user add first name "Hazem" and last name "Adel"
    And   user enter date of birth
    And   user enter new valid email address "Hazem_Adel@gmail.com"
    And   user enter valid password "password" and confirm it "password"
    And   user click on REGISTER button
    Then  Assert that success message displayed
