Feature: Fees Functionality

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then  User should login successfuly

  Scenario Outline: Create Fees
    And Click on the element in the left nav
      | SetupOne   |
      | Parameters |
      | Fees       |

    And Click on te element in the Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput            | <nameInput>            |
      | codeInput            | <codeInput>            |
      | IntegrationcodeInput | <IntegrationcodeInput> |
      | PriorityInput        | <PriorityInput>        |

    And Click on te element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from dialog
      | <nameInput> |

    Examples:
      | nameInput | codeInput     | IntegrationcodeInput | PriorityInput |
      | OnurFees1 | OnurFeesCode1 | OnurIntcode1         | 2121          |
      | OnurFees2 | OnurFeesCode2 | OnurIntcode2         | 2122          |
      | OnurFees3 | OnurFeesCode3 | OnurIntcode3         | 2123          |
      | OnurFees4 | OnurFeesCode4 | OnurIntcode4         | 2124          |