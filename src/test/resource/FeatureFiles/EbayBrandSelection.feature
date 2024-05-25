@regression @smoke @E2E
Feature: Ebay Brand Selection
  
  Description: User should be able to select the brands

  Background: Given open ebay Homepage

  Scenario Outline: Select items by brand
    Given search for "<Items>"
    When select by "<Brands>"
    Then Item list should have only selected "<Brands>"

    Examples: 
      | Items  | Brands |
      | Shoes  | adidas |
      | shirts | Jordan |
