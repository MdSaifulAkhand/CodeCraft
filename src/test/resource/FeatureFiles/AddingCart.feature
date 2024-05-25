@regression @smoke
Feature: Ebay Cart Functionality
  
  Description: User should be able to add items on the cart

  Background: 
    Given Open Ebay Homepage

  Scenario: Ebay cart functionality
    Given White Tuxedo Jacket with Black Satin Trim
    When Select the item from the search result
    And Select size type
    And Select size
    And Select length
    And Select quantity
    Then Add to the cart
