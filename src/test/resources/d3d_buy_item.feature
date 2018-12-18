

Feature:Buying a wifi doorbell item
  @buy
  Scenario:
     # Given I enter url as "https://www.d3dsecurity.co.uk/"
    And I click on Products
    And I click on security alarm system
    And I click on "D10- Wi-Fi / GSM Security Alarm System (Advance Pack)"
    And I click on add to cart

    And I should see item added to cart
    When I click on  cart
    And click on proceed to checkout
   # And enter billing details as "<firstname>", "<lastname>", "<email>" and "<phone>"
    And enter billing details from "buyitem.properties"
    And  I click on proceed to paypal
    Then I should see paypal checkoutheader page


