Feature:  ApachePOI Citizen Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

  Scenario: Create and delete vitizenship from excel
   When User Create citizenship with ApachePOI

  Scenario: delete vitizenship from excel
    Then User Delete citizenship with ApachePOI
