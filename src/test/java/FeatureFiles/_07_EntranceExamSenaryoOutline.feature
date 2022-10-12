Feature: Enterance Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then  User should login successfuly

  Scenario Outline: Create Entrance Exams
    And Click on the element in the left nav
      | EntranceExams1 |
      | SetupTwo       |
      | EntranceExams2 |

    And Click on te element in the Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <ExamName> |

    And User sending the keys in Form Content
      | academicPeriod         |
      | <AcademicPeriodOption> |
      | gradeLevel             |
      | <GradeLevelOption>     |


    And Click on te element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left nav
      | EntranceExams1 |
      | SetupTwo       |
      | EntranceExams2 |

    And User delete item from dialog
      | <ExamName> |

    Then Success message should be displayed

    Examples:
      | ExamName          | AcademicPeriodOption | GradeLevelOption |
      | Math exam is1qw   | academicPeriod1      | gradeLevel2      |
      | IT exam is1qw     | academicPeriod1      | gradeLevel2      |
      | Oracle exam is1qw | academicPeriod1      | gradeLevel2      |
      | Math exam  is1qw  | academicPeriod1      | gradeLevel2      |
