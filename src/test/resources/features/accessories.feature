Feature: BonBonite

  @AddAccessoriesToCart
  Scenario: Add one accessory to the shopping cart
    Given that enter on the web site "https://www.bon-bonite.com/"
    When he clicks on the accessories module and click buy now to the secoxnd item
      | identification | password       | name | lastname | numidentify | email                  | telephone  | direction        | code   |
      | 1059234151     | Anni1059234151 | Anni | Carvajal | 1059234151  | carvajalanni@gmail.com | 3233334445 | cra 19 # 25 B 10 | 100019 |
    Then he will buy the accessory product successfully
