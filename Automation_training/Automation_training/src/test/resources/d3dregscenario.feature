@d1
Feature:Registration functionality validation

 Background:
#  Given I enter url as "https://www.d3dsecurity.co.uk/"
  When  I click on the Register button

  Scenario: Validating Registration Functionality with Valid Data
    Given I entered First name as "durga"
    Given I entered Last name as "makkapati"
    Given I entered email as "durga.makkapati@gmail.com"
    And   I entered New password  as "password"
    And   I entered confirm password as "password"
    When  I click the Register button
    Then I should get confirmation email.

