Feature: enter in the page
  Scenario: Enter in the page in my account
    Given enter the website p "https://www.bon-bonite.com/"
    When he clicks on My Account - Wish List and the first product in the list he clicks on the x, deleting the product
    Then he will see in the wish list that the product is removed