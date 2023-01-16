@smoke
Feature: F06_homeSlider | user could select from home slider
  Scenario: First scenario user select iphone
    When user click on iphone photo will be directed to page of the product
    Then confirm that user directed to product page "iphone"

  Scenario: Second scenario user select samsung
    When user click on samsung photo will be directed to page of the product
    Then confirm that user directed to product page "samsung"