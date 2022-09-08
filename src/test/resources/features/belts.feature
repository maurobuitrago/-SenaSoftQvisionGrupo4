Feature: enter in the page

  @AddBeltsTocCard
  Scenario: enter in the page belts
    Given enter the website b "https://www.bon-bonite.com/"
    When he clicks on the belts module and add the third product to the add to cart module, he will verify that the handbags product is in the shopping cart
    Then he will verify that the handbags product is in the shopping cart

    @BuyProductBelts
    Scenario: enter in the page belts buy
      Given enter the website b "https://www.bon-bonite.com/"
      When he clicks on the free belts module and click "buy now" to the second item
      Then he will buy the belts product successfully