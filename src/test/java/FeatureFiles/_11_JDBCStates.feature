Feature: JDBC States testing

  Background:
    Given Navigate to basqar
    When  Enter username and password and click login button
    Then  User should login successfuly

  Scenario: States testing with JDBC
    And Click on the element in the left nav
      |SetupOne|
      |Parameters|
      |States |
    Then Send the query the database "select * from States;" an control match