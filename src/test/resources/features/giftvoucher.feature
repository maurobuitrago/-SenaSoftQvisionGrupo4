Feature: enter in the page

  @ValidateInfo
  Scenario: enter in the page gift voucher
    Given enter the website g "https://www.bon-bonite.com/"
    When he clicks on Gift Voucher
    Then he will bring up the Gift Voucher detail information

  @ChangeSelect
  Scenario: enter in the page gift voucher change
    Given enter the website g "https://www.bon-bonite.com/"
    When he clicks on Gift Voucher and he can change the cost of the voucher to and add it to the shopping cart
      | identification | password     |
      | 1002969210     | lunagp110903 |
    Then he will verify the voucher is in the shopping cart