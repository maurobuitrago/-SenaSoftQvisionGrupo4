Feature: BonBonite

  @ObtainInformationOutlet
  Scenario: Get the price of a discounted product
    Given that enter the web page "https://www.bon-bonite.com/"
    When he clicks on the Outlet option and chooses a product
    Then it should display the output product price information in the console
