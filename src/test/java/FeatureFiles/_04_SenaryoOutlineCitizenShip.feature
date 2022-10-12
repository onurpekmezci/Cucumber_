Feature: Citizenship with scenario Outline

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly


    Scenario Outline: Citizenship create
      And Navigate to Citizenship page
      When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
      Then  Success message should be displayed

      When  User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
      Then Already exist message should be displayed
      And Click on close button

      When User delete the "<CitizenshipName>" record
      Then Success message should be displayed

      Examples:

      |CitizenshipName|ShortName|
      |onurcountry1abx|oc1abx|
      |onurcountry2abx|oc2abx|
      |onurcountry3abx|oc3abx|
      |onurcountry4abx|oc4abx|
      |onurcountry5abx|oc5abx|
      |onurcountry6abx|oc6abx|

