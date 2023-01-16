@smoke
  Feature: F03_currencies | user can choose the currency
    Scenario: user can select one of two currencies
      When  user choose the currency "Euro"
      Then  confirm the selected currency