Feature: I as user add product at cart in san angel web site


  Scenario: Add product to cart
    Given user in sanangel web
    When add two products at cart
    And One product with two items
    And Two product with five items
    Then the cart has products