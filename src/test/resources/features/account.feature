Feature: BonBonite

  @SeeOrder
  Scenario: Add one accessory to the shopping cart
    Given that enter on the web site  "https://www.bon-bonite.com/"
    When See information about a product in the module My account and the order option
      | identification | password       |
      | 1059234151     | Anni1059234151 |
    Then you should see the product information in the console