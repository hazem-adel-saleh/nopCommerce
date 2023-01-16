@smoke
Feature: F04_search | user can search for a products or a specific product using name or sku of product
  Scenario: user can search for specific product using name of product
    When  user enter the product's name "htc" in the field of search
    Then  user redirected to search page with name result of his searching appears

  Scenario: user can search for a specific product using sku of product
    When  user enter the product's sku "AS_551_LP" in the field of search
    Then  user redirected to search page with sku "AS_551_LP" result of his searching appears