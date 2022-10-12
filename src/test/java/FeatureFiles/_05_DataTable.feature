Feature: DataTable Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then  User should login successfuly

#    Scenario: Create Country
#      And Click on the element in the left nav
#      |SetupOne|
#      |Parameters|
#      |Countries |
#
#      And Click on te element in the Dialog
#      |addButton|
#
#      And User sending the keys in Dialog Content
#      |nameInput|OnurCountry123|
#      |codeInput|ONR123        |
#
#      And Click on te element in the Dialog
#      |saveButton|
#
#      And Success message should be displayed
#
#      And User delete item from dialog
#      |OnurCountry123|
#
#  Scenario: Create Nationality
#    And Click on the element in the left nav
#      |SetupOne|
#      |Parameters|
#      |Nationality |
#
#    And Click on te element in the Dialog
#      |addButton|
#
#    And User sending the keys in Dialog Content
#      |nameInput|Onurnat123|
#
#    And Click on te element in the Dialog
#      |saveButton|
#
#    And Success message should be displayed
#
#    And User delete item from dialog
#    |Onurnat123|


  Scenario: Create Fees
    And Click on the element in the left nav
      |SetupOne|
      |Parameters|
      |Fees |

    And Click on te element in the Dialog
      |addButton|

    And User sending the keys in Dialog Content
      |nameInput|OnurFees1|
      |codeInput|OnurFeesCode1|
      |IntegrationcodeInput|OnurIntcode1|
      |PriorityInput|212|

    And Click on te element in the Dialog
      |saveButton|

    And Success message should be displayed

    And User delete item from dialog
      |OnurFees1|