Feature: BonBonite

  @AddToCart
  Scenario: Add product to shopping cart
    Given that enter  to the website "https://www.bon-bonite.com/"
    When he clicks on the Bags module and add the third product to the add to cart module
    Then he will verify that the bags product is in the shopping cart

  @AddWishList
  Scenario: Add product to wish list
    Given that enter  to the website "https://www.bon-bonite.com/"
    When he clicks on Handbags-wallets he can change the color of the second item and add it to my wishlist
      | identification | password     |
      | 1002969210     | lunagp110903 |
    Then he will verify that in the My account-wishlist module is the product Handbags
