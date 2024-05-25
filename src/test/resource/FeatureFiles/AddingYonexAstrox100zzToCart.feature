@regression @smoke
Feature: Ebay Cart Functionality Adding Yonex 
  
  Description: User should be able to add items on the cart

  Background: 
    Given Open Ebay Homepage

  Scenario: Ebay Add Yonex to cart functionality 
    Given search for yonex astrox 100 zz
    When Select the Badminton item from the search result
    And Select String
    And Select Tension
    And Select quantity of the racket
    Then Add the Racket to the cart
