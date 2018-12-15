
Feature:reading data from excel

@ex
  Scenario Outline:
    Given i read the excel file "<filename>" from "<directory>"


    Examples:
      | filename  | directory |
      | dvla.xlsx | testdata  |