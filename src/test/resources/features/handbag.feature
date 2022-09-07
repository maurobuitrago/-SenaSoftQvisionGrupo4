Feature: BonBonite

  @AddToCart
  Scenario: Add product to shopping cart
    Given that enter  to the website "https://www.bon-bonite.com/"
    When he clicks on the Bags module and add the third product to the add to cart module
    Then he will verify that the bags product is in the shopping cart
