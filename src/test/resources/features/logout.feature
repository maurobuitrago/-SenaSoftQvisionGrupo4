Feature: BonBonite

  @Logout
  Scenario: Logout of the website
    Given that enter the page "https://www.bon-bonite.com/"
    When He clicks on the My Account module and clicks on the logOut option
      | identification | password       |
      | 1059234151     | Anni1059234151 |
    Then he will have logged out of his logged in account
