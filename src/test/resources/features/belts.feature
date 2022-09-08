Feature: enter in the page

  @AddBeltsTocCard
  Scenario: enter in the page belts
    Given enter the website b "https://www.bon-bonite.com/"
    When he clicks on the belts module and add the third product to the add to cart module, he will verify that the handbags product is in the shopping cart
    Then he will verify that the handbags product is in the shopping cart

    @BuyProductBelts
    Scenario: enter in the page belts buy
      Given enter the website b "https://www.bon-bonite.com/"
      When he clicks on the free belts module and click buy now to the second item
        | identification | password     | name | lastname | numidentify | email              | telephone | direction         | code   |
        | 1002969210     | lunagp110903 | Luna | Giraldo  | 1002969210  | lunagp03@gmail.com | 3333333   | carrera19 #2a-105 | 100019 |
      Then he will buy the belts product successfully