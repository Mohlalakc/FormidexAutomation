Feature: Navigate to Repository

  Scenario Outline: As a user I want to navigate to the Repository and then got to Studies and perform some actions
    Given I am on Ryze landing page
    When I click on Repository button
    Then I click on Studies option
    And I click on Tech Study menu bar
    And I confirm the Tech study options "<View>" "<Edit>" "<RemoveThisStudy>" "<TransitionThisStudy>"
    And I click on View option
    And I click on Data Acquisition button
    And I click on Forms option

    Examples:
      |View|Edit| RemoveThisStudy | TransitionThisStudy  |
      |View|Edit|Remove this study| Transition this study|