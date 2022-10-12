Feature: Enterance Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then  User should login successfuly

  Scenario: Create Entrance Exams
    And Click on the element in the left nav
      | EntranceExams1 |
      | SetupTwo       |
      | EntranceExams2 |

    And Click on te element in the Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | onurexam1 |

    And User sending the keys in Form Content
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |


And Click on te element in the Dialog
|saveButton|

    Then Success message should be displayed

    And Click on the element in the left nav
      | EntranceExams1 |
      | SetupTwo       |
      | EntranceExams2 |

    And User delete item from dialog
      |onurexam1|

Then Success message should be displayed

