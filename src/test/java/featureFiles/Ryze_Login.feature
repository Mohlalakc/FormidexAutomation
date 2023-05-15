Feature: Login to Ryze

  Scenario Outline: As a user I want to login to Ryze application
    Given Ryze website is open and I am on a login page open on "<Browser>" "<Environment>"
    When I login with "<Username>" and "<Password>" credentials
    Then I click on Login button
    And I login to Ryze medical application


    Examples:
    |Username        | Password   | Browser| Environment|
    |testteamtechtest| Ryz3T3st!x | Chrome | QA         |