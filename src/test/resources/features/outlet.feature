Feature: BonBonite

  @BuyProductOnSale
  Scenario: Buy of a product from the outlet module
    Given that enter the web page "https://www.bon-bonite.com/"
    When he clicks on the outlet module and click buy now to the second item
      | identification | password       | name | lastname | numidentify | email            | telephone   | direction          | code   |
      | 1059234151     | Anni1059234151 | Luna | Giraldo  | 1061573725  | lunita@gmail.com | 30588624452 | cra 19 pandiguando | 100019 |
    Then he will buy the product from the outlet module successfully

  @ObtainInformationOutlet
  Scenario: Get the price of a discounted product
    Given that enter the web page "https://www.bon-bonite.com/"
    When he clicks on the Outlet option and chooses a product
    Then it should display the output product price information in the console

  @AddProductToCart
  Scenario: Add product to module outlet shopping cart
    Given that enter  to the website "https://www.bon-bonite.com/"
    When he clicks on the outlet module and add the third product to the add to cart
    Then he will verify that the outlet product is in the shopping cart