
Feature: d3dregistration
@d2
  Background:
#    Given I enter url as "https://www.d3dsecurity.co.uk/"
    When  I click on the Register button

  Scenario Outline: Validating ‘Registration’ Functionality with Invalid data
    Given I enter First name as "<First name>"
    Given I enter Last name as "<Last name>"
    Given  I enter email as "<email>"
    And I enter New password  as "<New password>"
    And I enter confirm password as "<confirm password>"
    When I click Register button
    Then I should see Error message as "<ErrorMessage>" for "<scenarios>"


    Examples:
      | First name | Last name | email                     | New password | confirm password | ErrorMessage           | scenarios |
      | Empty      | Makkapati | durga.makkapati@gmail.com | password     | password         | Username is not valid  | SC1       |
      | Durga      | Empty     | durga.makkapati@gmail.com | password     | password         | Last name is not valid | SC2       |
      | Durga      | Makkapati | Empty                     | password     | password         | email is not valid     | SC3       |
      | Durga      | Makkapati | durga.makkapati@gmail.com | password     | Empty            | password is not valid  | SC4       |
      | Empty      | Empty     | Empty                     | Empty        | Empty            | username is not valid  | SC5       |
