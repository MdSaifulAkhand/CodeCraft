@regression @smoke @E2E
Feature: Ebay Search Functionality

  Scenario: Search for Shoes
    Given Open Ebay Homepage
    When Search for shoes
    Then search result should have only shoes related products

  Scenario: Search for Shirt
    Given Open Ebay Homepage
    When Search for Shirt
    Then search result should only have Shirt related product
