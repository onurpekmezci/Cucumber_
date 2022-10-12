#employee menusu için create - exist - Delete bölümleri olan senaryo yazınız
  # 5 farklı değer için çalıştırınız
Feature: Create, Exist and Delete Employee

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create Employee

    And Got to Employee functionality
      | HRlink       |
      | EmployeeLink |

    And Click AddButton
      | addButton |

    And Send information for textcontent
      | firstName  | <firstName>  |
      | lastName   | <lastName>   |
      | employeeID | <employeeID> |
      | documentID | <documentID> |

    And Send information for selectcontent
      | EmployeeTypeButton |
      | Supervisor         |
      | DocumentTypeButton |
      | Personal         |

    And Click to contact and address
    |contact_Address|

    And Send information for textcontent
      | Country  | <Country>  |

    And Click Save Button
    |countrySelect|
    |saveButton|

    And verify succesfully added address
    |SuccessDialog|successfully|
    Examples:
      | firstName | lastName | employeeID | documentID |Country|
      | onur      | pekmezci | 3658     | 3652    |Turkey|