

Feature:To find the details of given car registration number
   @c1
   Scenario:
    # Given I enter url as "<https://www.gov.uk/get-vehicle-information-from-dvla>"
     And i click on startnow
     And i read the registration_num from excel "dvla.xlsx" at directory "testdata"
     And i enter the registration_num
     When i click continue
     Then i should see "<Make>" and "<Colour>"


#  @car2
#  Scenario Outline:
#    Given I enter "<registrationnumber_of_vehicle>"
#    When i click continue
#    Then i should see Make and Colour
#    Then I should see "<Make>" and "<Colour>" for "<scenarios>"
#
#
#    Examples:
#      | registrationnumber_of_vehicle | Make    | Colour  |scenarios|
#      | BP57YVR                       | peugeot | silver  | sc1     |
#      | FH13BH0                       | peugeot | white   | sc2     |

