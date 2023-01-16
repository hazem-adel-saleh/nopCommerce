@smoke
Feature: F02_login | user could login with his account

    Scenario: user could not login with invalid credentials
      Given user go to login page
      When  user enter his email "Wrong@gmail.com" and his password "wrongPassword"
      And   user click on LOG IN button
      Then  failed message displayed with red background

    Scenario: user could login with valid credentials
      Given user go to login page
      When  user enter his email "Hazem_Adel@gmail.com" and his password "password"
      And   user click on LOG IN button
      Then  user redirected to home page and Log out button is displayed