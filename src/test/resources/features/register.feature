Feature: BonBonite

  @RegisterSuccessfully
  Scenario: Register user successfully on the website BonBonite
    Given that enter on the website "https://www.bon-bonite.com/"
    When he clicks on my account and fill in the following form data
      | identification | email                | password       |
      | 1059234277     | amcarvajal@gmail.com | Anni1059234151 |
    Then he will be successfully registered