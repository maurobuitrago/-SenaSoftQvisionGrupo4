Feature: entre in the page

  @BuyProductShoes
  Scenario: enter in the page buy shoes
    Given enter the website s "https://www.bon-bonite.com/"
    When he clicks on the shoes-tennis module and hits the buy now button on the second item
      | identification | password     | name | lastname | numidentify | email              | telephone | direction         | code   |
      | 1002969210     | lunagp110903 | Luna | Giraldo  | 1002969210  | lunagp03@gmail.com | 3333333   | carrera19 #2a-105 | 100019 |
    Then he will buy the shoes product successfully.

  @AddShoesToCard
  Scenario: Add a product from the shoes module to the shopping cart
    Given enter the website s "https://www.bon-bonite.com/"
    When he clicks on the Shoes-Boots module and adds the third product to add to the cart
    Then he should see the shoe product in the shopping cart


