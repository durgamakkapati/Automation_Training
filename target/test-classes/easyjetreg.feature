@smoke
Feature:Registration functionality validation

  Background:
#    Given I enter url as "https://www.easyjet.com/EN/"
    When I click on Sign in button
    When I click Register here button

  Scenario: Validating Registration Functionality with valid data
    Given I enter email ID as "durga.makkapati@gmail.com"
    Given I enter confirming email ID as "durga.makkapati@gmail.com"
#    Given I enter password as "password"
#    Given I enter confirm password as "password"
#    Given I select title from dropdown menu "Mrs"
#    Given I enter first name as"Durga"
#    Given I enter surname as "Makkapati"
#    Given I enter address as "22 Balata close"
#    Given I enter town/city as "Burton"
#    Given I enter postcode as "DE123DG"
#    Given I click country from dropdown menu as "UK"
#    Given I enter phone number as "12345678"
#    When I click Register Now button
   # Then I should receive "<Email Notification>"
  Then I should see header as "Your easyJet.com log in"
