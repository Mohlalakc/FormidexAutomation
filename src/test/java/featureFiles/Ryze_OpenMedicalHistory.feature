Feature: Edit Medical History description

  Scenario Outline: As a user I want to edit description and click on
    Given I am on Forms page
    When I click on Medical History option
    Then I click on Edit Medical History option
    And I clear Description textbox
    And I enter the "<Description>"
    And I click on the Update update button

    Examples:
      |Description                                               |
      | This description was changed by Kgothatso Collen Mohlala"|