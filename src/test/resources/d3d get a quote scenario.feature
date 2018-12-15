
@dp
Feature:D3D Security – To Verify "Get a quote"

  Background:
#    Given I entered url "https://www.d3dsecurity.co.uk"
    When I click on Online Demo


  Scenario:
    Given I entered first name as "Durga"
    And I entered last name as "Makkapati"
    And I entered email as "durga.makkapati@gmail.com"
    And I entered phone number as "123456"
    And I entered subject as "Hello"
    And I entered message as "Please let us know the cost of 5 cctv camera’s"
    And I entered the Captcha Code
    When I click on button Send message
    Then I should see email notification
