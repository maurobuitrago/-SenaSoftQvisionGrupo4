Feature: BonBonite

  @LoginSuccessfully
  Scenario: Login successfully to the website BonBonite
    Given that enter to the website "https://www.bon-bonite.com/"
    When he enter the correct credentials
      | identification | password       |
      | 1059234151     | Anni1059234151 |
    Then he will login correctly

  @LoginWrong
  Scenario: Wrong login to the website BonBonite
    Given that enter to the website "https://www.bon-bonite.com/"
    When he enter the wrong credentials
      | identification | password     |
      | 1059234242     | 123450000red |
    Then he will log in incorrectly