Feature: Verify the price of an iPhone and an iPhone accessory
  As an amazon customer
  I want to add an iPhone and an accessory to the basket
  So that I can verify its price

  Scenario: Add iPhone and an accessory
    Given I search for a "iPhone 6" on Amazon UK
    When I add the item to the basket
    Given I search for a "iPhone 6 case" on basket page
    When I add the item to the basket
    Then The total cost should be the sum of items added before

